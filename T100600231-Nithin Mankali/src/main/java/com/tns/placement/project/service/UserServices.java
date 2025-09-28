package com.tns.placement.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tns.placement.project.Entity.UserDetails;
import com.tns.placement.project.repo.UserRepo;

@Service
public class UserServices {
	@Autowired

	public UserRepo srepo;

	

	//Insertion

		public UserDetails addUser(UserDetails user) {

			return srepo.save(user);

		}

		

		
		//Getting data from db

		

				public List<UserDetails> getUserDetails(){

					return srepo.findAll();

				}

				

				//delete the data

				public void deleteUserDetails(int Userid) {

					srepo.deleteById(Userid);

				}

				
			
		
	

}
