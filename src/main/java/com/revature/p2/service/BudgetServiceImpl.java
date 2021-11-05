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

    public List<Budget> findAll() {
        return budgetRepository.findAll();
    }

    public List<Budget> findByName(String name) {
        return budgetRepository.findByName(name);
    }

    public Budget findByUid(int uid) {
        return null;
    }

    public Budget findByBid(int bid) {
        return null;
    }

    public void save(Budget budget) {
        budgetRepository.save(budget);
    }

    public void update(int id, Budget budget) {
        budgetRepository.save(budget);
    }

    public void delete(int id) {
        budgetRepository.deleteById(id);
    }
}
