package com.revature.p2.service;

import com.revature.p2.model.Transactions;

import java.util.List;

public interface TransactionService {
    
    public List<Transactions> findAll();
    
    public List<Transactions> findByTransactionDate(String date);
    
    public Transactions findByTid(int tid);
    
    public List<Transactions> findByUid(int uid);
    
    public void save(Transactions transactions);

    public void update(int tid, Transactions transactions);

    public void delete(int tid);
}
