package com.infyshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infyshine.model.Employee;
import com.infyshine.model.User;
import com.infyshine.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;

	//@Autowired
	//UserProxy userProxy;

	@PostMapping(path = "/addUser")
	public String addUser(@RequestBody User user) {
		String s = loginService.addUser(user);
		return s;

	}

	/*@PostMapping(path = "/getAll")
	public List<Employee> getUser() {
     List<Employee> list =userProxy.getEmployee();
		return list;

	}
*/
}
