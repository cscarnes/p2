package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "budget")
@Data
public class Budget {
    private String name;
    private float budgetAmount;
    private String budgetLength;
    private int uid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bid;

}
