package com.revature.p2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bills")
@Data
public class Bills {

    private String name;
    private float amount;
    private String dueDate;
    private int uid;
    @Id
    private int bid;
}
