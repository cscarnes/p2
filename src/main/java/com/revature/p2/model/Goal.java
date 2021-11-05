package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "goal")
@Data
public class Goal {

    private String name;
    private float amount;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gid;
    private int uid;
    private boolean type;
}
