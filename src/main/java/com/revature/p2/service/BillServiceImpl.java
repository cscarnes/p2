package com.revature.p2.service;

import com.revature.p2.model.Bill;
import com.revature.p2.repo.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService{
    @Autowired
    BillRepository billRepository;

    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public List<Bill> findByName(String name) {
        return billRepository.findByName(name);
    }

    @Override
    public Bill findByBid(int bid) {
        return billRepository.findByBid(bid);
    }

    @Override
    public List<Bill> findByUid(int uid) {
        return billRepository.findByUid(uid);
    }

    @Override
    public void save(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void update(int bid, Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void delete(int bid) {
        billRepository.deleteById(bid);
    }
}
