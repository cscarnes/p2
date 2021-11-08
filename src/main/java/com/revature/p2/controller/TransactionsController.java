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

    @GetMapping("/transactionsT/{tid}")
    public Transactions findByTid(@PathVariable int tid) {
        return transactionService.findByTid(tid);
    }

    @GetMapping("/transactionsU/{uid}")
    public List<Transactions> findByUId(@PathVariable int uid) {
        return transactionService.findByUid(uid);
    }

    @PostMapping("/transactions")
    public void save(@RequestBody Transactions transactions) {
        transactionService.save(transactions);
    }

    @PutMapping("/transactions/{tid}")
    public void update(@PathVariable int tid, @RequestBody Transactions transactions) {
        transactionService.save(transactions);

    }

    @DeleteMapping("/transactions/{tid}")
    public void delete(@PathVariable int tid) {
        transactionService.delete(tid);

    }
}
