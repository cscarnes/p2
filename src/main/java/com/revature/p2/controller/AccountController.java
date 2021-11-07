package com.revature.p2.controller;

import com.revature.p2.model.Account;
import com.revature.p2.repo.AccountRepository;
import com.revature.p2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    
    @Autowired
    AccountService accountService;

    @GetMapping("/account")
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/account/{name}")
    public List<Account> findByName(@PathVariable String name) {
        return accountService.findByName(name);
    }

    @GetMapping("/account/{aid}")
    public Account findByBid(@PathVariable int aid) {
        return accountService.findByAid(aid);
    }

    @GetMapping("/account/{uid}")
    public Account findById(@PathVariable int uid) {
        return accountService.findByUid(uid);
    }

    @PostMapping("/account")
    public void save(@RequestBody Account account) {
        accountService.save(account);

    }

    @PutMapping("/account/{aid}")
    public void update(@PathVariable int bid, @RequestBody Account account) {
        accountService.save(account);

    }

    @DeleteMapping("/account/{aid}")
    public void delete(@PathVariable int bid) {
        accountService.delete(bid);

    }
}
