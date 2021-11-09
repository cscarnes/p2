package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
@Data
public class Account implements Serializable {
    private static final long serialVersionUID = -6790693372846798580L;

    private String name;
    private float balance;
    @Column(name = "uid", nullable = true)
    private int uid;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int aid;

    @ManyToOne
    private User user;
}
