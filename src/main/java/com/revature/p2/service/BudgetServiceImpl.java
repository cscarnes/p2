package com.revature.p2.service;

import com.revature.p2.model.Budget;
import com.revature.p2.repo.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService{

    @Autowired
    BudgetRepository budgetRepository;

    @Override
    public List<Budget> findAll() {
        return budgetRepository.findAll();
    }

    @Override
    public List<Budget> findByName(String name) {
        return budgetRepository.findByName(name);
    }

    @Override
    public Budget findByUid(int uid) {
        return null;
    }

    @Override
    public Budget findByBid(int bid) {
        return null;
    }

    @Override
    public void save(Budget budget) {
        budgetRepository.save(budget);
    }

    @Override
    public void update(int id, Budget budget) {
        budgetRepository.save(budget);
    }

    @Override
    public void delete(int id) {
        budgetRepository.deleteById(id);
    }
}
