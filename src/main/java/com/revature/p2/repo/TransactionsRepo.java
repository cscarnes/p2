package com.revature.p2.repo;

import com.revature.p2.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionsRepo extends JpaRepository<Transactions, Integer> {

    public List<Transactions> findByDate(String date);

    public Transactions findByTid(int tid);

    public Transactions findByUid(int uid);
}
