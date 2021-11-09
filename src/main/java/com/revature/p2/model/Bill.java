package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
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
    @Column(name = "uid", nullable = true)
    private int uid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int bid;

    @ManyToOne
    private User user;
}
