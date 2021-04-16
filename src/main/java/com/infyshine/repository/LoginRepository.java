package com.infyshine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infyshine.model.User;


public interface LoginRepository extends JpaRepository<User,Integer> {

//@Query(from user where userName="infyshine")
	//User findByName(String userName);

}
