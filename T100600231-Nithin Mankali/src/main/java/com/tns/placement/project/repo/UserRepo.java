package com.tns.placement.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.placement.project.Entity.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails,Integer> {
	

}
