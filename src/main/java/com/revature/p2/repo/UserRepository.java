package com.revature.p2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p2.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User> findByEmail(String email);
	
	public List<User> findByUsername(String username);
}
