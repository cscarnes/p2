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

    @GetMapping("/accountA/{id}")
    public Account findByAid(@PathVariable int id) {
        return accountService.findByAid(id);
    }

    @PostMapping("/account")
    public void save(@RequestBody Account account) {
        accountService.save(account);
    }

    @PutMapping("/account/{id}")
    public void update(@PathVariable int id, @RequestBody Account account) {
        accountService.save(account);
    }

    @DeleteMapping("/account/{id}")
    public void delete(@PathVariable int id) {
        accountService.delete(id);
    }
}
