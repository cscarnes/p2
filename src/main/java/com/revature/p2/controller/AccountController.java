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

    @GetMapping("/accountA/{aid}")
    public Account findByAid(@PathVariable int aid) {
        return accountService.findByAid(aid);
    }

    @GetMapping("/accountU/{uid}")
    public List<Account> findByUId(@PathVariable int uid) {
        return accountService.findByUid(uid);
    }

    @PostMapping("/account")
    public void save(@RequestBody Account account) {
        accountService.save(account);
    }

    @PutMapping("/account/{aid}")
    public void update(@PathVariable int aid, @RequestBody Account account) {
        accountService.save(account);
    }

    @DeleteMapping("/account/{aid}")
    public void delete(@PathVariable int aid) {
        accountService.delete(aid);
    }
}
