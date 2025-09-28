package com.tns.placement.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.placement.project.Entity.UserDetails;
import com.tns.placement.project.service.UserServices;

@RestController 
public class UserController {
	@Autowired
	public UserServices User;
	
	@PostMapping("/addstud")
	public UserDetails addStudent(@RequestBody UserDetails std) {
		return User.addUser(std);
	}
	
	@GetMapping("/getstud")
	public List<UserDetails> getStudent(){
		return User.getUserDetails();
	}
	
	@DeleteMapping("/deleteUserid/{userid}")
	public void deleteStudent(@PathVariable int userid) {
		User.deleteUserDetails(userid);
	}
	


}
