package com.revature.p2.service;

import com.revature.p2.model.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public List<Account> findByName(String name);

    public Account findByUid(int uid);

    public Account findByAid(int aid);

    public void save(Account account);

    public void update(int id, Account account);

    public void delete(int id);
}
