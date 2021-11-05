package com.revature.p2.service;

import com.revature.p2.model.Account;
import com.revature.p2.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public List<Account> findByName(String name) {
        return accountRepository.findByName(name);
    }

    public Account findByUid(int uid) {
        return null;
    }

    public Account findByAid(int aid) {
        return null;
    }

    public void save(Account account) {
        accountRepository.save(account);
    }

    public void update(int id, Account account) {
        accountRepository.save(account);
    }

    public void delete(int id) {
        accountRepository.deleteById(id);
    }
}
