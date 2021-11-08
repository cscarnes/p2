package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
@Data
public class Transactions {
    private String transactionDate;
    private float transactionAmount;
    private int uid;
    //private int aid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tid;
}
