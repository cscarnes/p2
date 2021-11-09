package com.revature.p2.model;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "username")
})
@Data
public class User implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private String name;
	private String email;
	@Column(name = "username", unique = true, nullable = false)
	private String username;
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<Bill> bills;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<Account> account;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<Budget> budget;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<Transactions> transactions;

	
}
