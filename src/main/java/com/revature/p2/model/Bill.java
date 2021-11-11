package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "bills")
@Data
public class Bill implements Serializable {
    private String name;
    private float amount;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer bid;

}
