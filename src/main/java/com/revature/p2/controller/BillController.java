package com.revature.p2.controller;

import com.revature.p2.model.Bill;
import com.revature.p2.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/bills")
    public List<Bill> findAll() {
        return billService.findAll();
    }

    @GetMapping("/bills/{name}")
    public List<Bill> findByName(@PathVariable String name) {
        return billService.findByName(name);
    }

    @GetMapping("/billsB/{id}")
    public Bill findByBid(@PathVariable int bid) {
        return billService.findByBid(bid);
    }

    @PostMapping("/bills")
    public void save(@RequestBody Bill bill) {
        billService.save(bill);

    }

    @PutMapping("/bills/{bid}")
    public void update(@PathVariable int bid, @RequestBody Bill bill) {
        billService.save(bill);

    }

    @DeleteMapping("/bills/{bid}")
    public void delete(@PathVariable int bid) {
        billService.delete(bid);

    }
}
