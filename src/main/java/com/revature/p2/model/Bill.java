package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "JoinTableBillEntity")
@Table(name = "bills", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
@Data
public class Bill implements Serializable {
    private static final long serialVersionUID = -6790693372846798578L;

    private String name;
    private float amount;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int bid;

}
