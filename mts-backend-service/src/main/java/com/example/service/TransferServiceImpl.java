package com.example.service;

import com.example.entity.Account;
import com.example.entity.TransactionHistory;
import com.example.entity.TransactionType;
import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.repository.AccountRepository;
import com.example.repository.TransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;

    @Override
    @Transactional(
            rollbackFor = {RuntimeException.class},
            noRollbackFor = {},
            timeout = 30
    )
    public boolean transfer(double amount, String source, String destination) {
        // step-1: load source and destination accounts
        Account sourceAccount = accountRepository.findById(source)
                .orElseThrow(() -> new AccountNotFoundException("source account not found"));
        Account destinationAccount = accountRepository.findById(destination)
                .orElseThrow(() -> new AccountNotFoundException("destination account not found"));
        // validation
        if (sourceAccount.getBalance() < amount) {
            throw new AccountBalanceException("source account balance is not enough");
        }
        // step-2: debit & credit
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        // step-3: update source and destination accounts
        accountRepository.save(sourceAccount);
        accountRepository.save(destinationAccount);

        TransactionHistory debitTransaction = new TransactionHistory();
        debitTransaction.setAmount(amount);
        debitTransaction.setAccountNumber(sourceAccount.getNumber());
        debitTransaction.setTransactionType(TransactionType.DEBIT);
        debitTransaction.setDateTime(LocalDateTime.now());

        TransactionHistory creditTransaction = new TransactionHistory();
        creditTransaction.setAmount(amount);
        creditTransaction.setAccountNumber(destinationAccount.getNumber());
        creditTransaction.setTransactionType(TransactionType.CREDIT);
        creditTransaction.setDateTime(LocalDateTime.now());

        transactionHistoryRepository.save(debitTransaction);
        transactionHistoryRepository.save(creditTransaction);

        return true;
    }


}
