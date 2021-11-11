package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "transactions")
@Data
public class Transactions implements Serializable {
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    private float transactionAmount;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer tid;

}
