package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "JoinTableBudgetEntity")
@Table(name = "budget", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
@Data
public class Budget implements Serializable {
    private static final long serialVersionUID = -6790693372846798579L;

    private String name;
    private float budgetAmount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date length;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int bid;
}
