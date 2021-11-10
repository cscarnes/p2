package com.revature.p2.model;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "JoinTableEmployeeEntity")
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
	private int userId;
	private String name;
	private String email;
	@Column(name = "username", unique = true, nullable = false)
	private String username;
	private String password;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_bill", joinColumns={@JoinColumn(name="id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="bill_id", referencedColumnName="id")})
	private Set<Bill> bills;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_account", joinColumns={@JoinColumn(name="id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="account_id", referencedColumnName="id")})
	private Set<Account> account;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_budget", joinColumns={@JoinColumn(name="id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="budget_id", referencedColumnName="id")})
	private Set<Budget> budget;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_transaction", joinColumns={@JoinColumn(name="id", referencedColumnName="id")}
			, inverseJoinColumns={@JoinColumn(name="transaction_id", referencedColumnName="id")})
	private Set<Transactions> transactions;

	
}
