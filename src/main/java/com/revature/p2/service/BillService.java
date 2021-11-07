package com.revature.p2.service;

import com.revature.p2.model.Bill;

import java.util.List;

public interface BillService {

    public List<Bill> findAll();

    public List<Bill> findByName(String name);

    public Bill findByBid(int bid);

    public Bill findByUid(int uid);

    public void save(Bill bill);

    public void update(int bid, Bill bill);

    public void delete(int bid);
}
