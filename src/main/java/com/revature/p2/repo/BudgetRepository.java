package com.revature.p2.repo;

import com.revature.p2.model.Budget;
import com.revature.p2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepository extends JpaRepository <Budget, Integer> {

    public Budget findByBid(int bid);

    public List<Budget> findByName(String name);
}
