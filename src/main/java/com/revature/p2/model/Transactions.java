package com.revature.p2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
@Data
public class Transactions {
    private String transactionDate;
    private float transactionAmount;
    private int uid;
    private int aid;
    @Id
    private int tid;
}
