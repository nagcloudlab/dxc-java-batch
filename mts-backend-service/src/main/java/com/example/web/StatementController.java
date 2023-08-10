package com.example.web;

import com.example.entity.TransactionHistory;
import com.example.repository.TransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StatementController {

    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;

    @RequestMapping(method = RequestMethod.GET, path ="/statement")
    public String statement(Model model) {
        Iterable<TransactionHistory> transactionHistories=transactionHistoryRepository.findAll();
        model.addAttribute("transactionHistories",transactionHistories);
        return "statement";
    }

}
