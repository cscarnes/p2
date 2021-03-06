package com.revature.p2.controller;

import com.revature.p2.model.Budget;
import com.revature.p2.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BudgetController {
    
    @Autowired
    BudgetService budgetService;

    @GetMapping("/budget")
    public List<Budget> findAll() {
        return budgetService.findAll();
    }

    @GetMapping("/budget/{name}")
    public List<Budget> findByName(@PathVariable String name) {
        return budgetService.findByName(name);
    }

    @GetMapping("/budgetB/{id}")
    public Budget findByBid(@PathVariable int id) {
        return budgetService.findByBid(id);
    }

    @PostMapping("/budget")
    public void save(@RequestBody Budget budget) {
        budgetService.save(budget);
    }

    @PutMapping("/budget/{id}")
    public void update(@PathVariable int id, @RequestBody Budget budget) {
        budgetService.save(budget);
    }

    @DeleteMapping("/budget/{id}")
    public void delete(@PathVariable int id) {
        budgetService.delete(id);
    }
}
