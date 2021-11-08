package com.revature.p2.service;

import com.revature.p2.model.Transactions;
import com.revature.p2.repo.TransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    TransactionsRepo transactionsRepo;

    @Override
    public List<Transactions> findAll() {
        return transactionsRepo.findAll();
    }

    @Override
    public List<Transactions> findByTransactionDate(String date) {
        return transactionsRepo.findByTransactionDate(date);
    }

    @Override
    public Transactions findByTid(int tid) {
        return transactionsRepo.findByTid(tid);
    }

    @Override
    public List<Transactions> findByUid(int uid) {
        return transactionsRepo.findByUid(uid);
    }

    @Override
    public void save(Transactions transactions) {
        transactionsRepo.save(transactions);
    }

    @Override
    public void update(int tid, Transactions transactions) {
        transactionsRepo.save(transactions);
    }

    @Override
    public void delete(int tid) {
        transactionsRepo.deleteById(tid);
    }
}
