package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "transactions", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
@Data
public class Transactions implements Serializable {

    private static final long serialVersionUID = -6790693372846798577L;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    private float transactionAmount;
    @Column(name = "uid", nullable = true)
    private int uid;
    //private int aid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int tid;

    @ManyToOne
    private User user;
}
