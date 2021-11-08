package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.User;
import com.revature.p2.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/usersE/{email}")
	public List<User> findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@GetMapping("/usersU/{username}")
	public List<User> findByUsername(@PathVariable String username) {
		return userService.findByUsername(username);
	}
	
	@GetMapping("/usersI/{id}")
	public User findById(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@PostMapping("/users")
	public void save(@RequestBody User user) {
		userService.save(user);
	}
	
	@PutMapping("/users/{id}")
	public void update(@PathVariable int id, @RequestBody User user) {
		userService.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable int id) {
		userService.delete(id);
	}

}
