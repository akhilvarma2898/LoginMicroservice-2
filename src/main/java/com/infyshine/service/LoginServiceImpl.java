package com.infyshine.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.infyshine.exception.UserNotFoundException;
import com.infyshine.model.User;
import com.infyshine.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepository;

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method
		if (user != null) {
			//loginRepository.save(user);
			throw new UserNotFoundException("user deteails not found");
		}else {
			//throw new UserNotFoundException("user deteails not found");
		}

		String s = "User Added successfully";

		return s;
	}

}
