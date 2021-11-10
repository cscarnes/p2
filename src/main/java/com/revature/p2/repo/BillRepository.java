package com.revature.p2.repo;

import com.revature.p2.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository <Bill, Integer> {

    public List<Bill> findByName(String name);

    public List<Bill> findByDueDate(String date);

    public Bill findByBid(int bid);

}
