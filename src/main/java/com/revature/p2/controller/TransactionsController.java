package com.revature.p2.controller;

import com.revature.p2.model.Transactions;
import com.revature.p2.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionsController {
    
    @Autowired
    TransactionService transactionService;

    @GetMapping("/transactions")
    public List<Transactions> findAll() {
        return transactionService.findAll();
    }

    @GetMapping("/transactions/{transactionDate}")
    public List<Transactions> findByDate(@PathVariable String date) {
        return transactionService.findByTransactionDate(date);
    }

    @GetMapping("/transactionsT/{id}")
    public Transactions findByTid(@PathVariable int id) {
        return transactionService.findByTid(id);
    }

    @PostMapping("/transactions")
    public void save(@RequestBody Transactions transactions) {
        transactionService.save(transactions);
    }

    @PutMapping("/transactions/{id}")
    public void update(@PathVariable int id, @RequestBody Transactions transactions) {
        transactionService.save(transactions);

    }

    @DeleteMapping("/transactions/{id}")
    public void delete(@PathVariable int id) {
        transactionService.delete(id);

    }
}
