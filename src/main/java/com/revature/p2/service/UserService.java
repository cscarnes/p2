package com.revature.p2.service;

import java.util.List;

import com.revature.p2.model.User;

public interface UserService {
	
	public List<User> findAll();
	
	public List<User> findByEmail(String email);
	
	public List<User> findByUsername(String username);
	
	public User findById(int id);
	
	public void save(User user);
	
	public void update(int id, User user);
	
	public void delete(int id);

}
