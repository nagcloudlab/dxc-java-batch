package com.example.web;

import com.example.exception.AccountBalanceException;
import com.example.exception.AccountNotFoundException;
import com.example.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransferController {

    @Autowired
    private TransferService transferService;

    @RequestMapping(method = RequestMethod.GET, path = "/transfer")
    public String transfer() {
        return "transfer-form";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/transfer")
    public String transfer(
            @RequestParam(value = "amount", required = true) double amount,
            @RequestParam(value = "source", required = true) String source,
            @RequestParam(value = "destination", required = true) String destination,
            Model model
            ) {
        try {
            boolean b = transferService.transfer(amount, source, destination);
            String message = b ? "Transfer Success" : "Transfer Failed";
            model.addAttribute("message", message);
        }catch (AccountNotFoundException | AccountBalanceException e){
            model.addAttribute("message", e.getMessage());
        }
        return "transfer-status";
    }



}
