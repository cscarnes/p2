package com.revature.p2.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "JoinTableAccountEntity")
@Table(name = "account", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
@Data
public class Account implements Serializable {
    private static final long serialVersionUID = -6790693372846798580L;

    private String name;
    private float balance;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int aid;

}
