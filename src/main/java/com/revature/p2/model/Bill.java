package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bills")
@Data
public class Bill {

    private String name;
    private float amount;
    private String dueDate;
    private int uid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bid;
}
