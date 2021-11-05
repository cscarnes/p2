package com.revature.p2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Data
public class Account {
    private String name;
    private float balance;
    private int uid;
    private int aid;

}
