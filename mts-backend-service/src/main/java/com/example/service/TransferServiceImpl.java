package com.example.service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public boolean transfer(double amount, String source, String destination) {
        // step-1: load source and destination accounts
        Account sourceAccount = accountRepository.findById(source)
                .orElseThrow(()->new IllegalArgumentException("source account not found"));
        Account destinationAccount = accountRepository.findById(destination)
                .orElseThrow(()->new IllegalArgumentException("destination account not found"));
        // step-2: debit & credit
        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        destinationAccount.setBalance(destinationAccount.getBalance()+amount);
        // step-3: update source and destination accounts
        accountRepository.save(sourceAccount);
        accountRepository.save(destinationAccount);
        return true;
    }


}
