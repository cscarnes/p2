package com.revature.p2.service;

import com.revature.p2.model.Budget;

import java.util.List;

public interface BudgetService {

    public List<Budget> findAll();

    public List<Budget> findByName(String name);

    public Budget findByBid(int bid);

    public void save(Budget budget);

    public void update(int id, Budget budget);

    public void delete(int id);
}
