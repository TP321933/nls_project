package com.userregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userregistration.model.User;


public interface SignupRepo extends JpaRepository<User,Long>{
	
	User findByEmail(String email);
	

}
