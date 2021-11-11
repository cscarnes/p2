package com.revature.p2.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "JoinTableEmployeeEntity")
@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "username")
})
@Data
public class User implements Serializable {
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
	@JoinTable(name = "user_bills", joinColumns = {@JoinColumn(name="user_id", referencedColumnName = "id")}
	, inverseJoinColumns={@JoinColumn(name="bid", referencedColumnName = "id")})
	private Set<Bill> bills;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_account", joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="aid", referencedColumnName="id")})
	private Set<Account> accounts;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_budget", joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="bid", referencedColumnName="id")})
	private Set<Budget> budget;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_transaction", joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="tid", referencedColumnName="id")})
	private Set<Transactions> transactions;

	
}
