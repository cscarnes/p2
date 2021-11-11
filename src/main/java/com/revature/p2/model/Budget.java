package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "budget")
@Data
public class Budget implements Serializable {
    private String name;
    private float budgetAmount;
    @Temporal(TemporalType.DATE)
    private Date length;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer bid;
}
