package com.infyshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infyshine.configuration.MyUserService;
import com.infyshine.model.JwtRequest;
import com.infyshine.response.JwtResponse;
import com.infyshine.util.JwtUtility;

@RestController
public class HomeController {
	
	 @Autowired
	    private JwtUtility jwtUtility;

	    @Autowired
	    private AuthenticationManager authenticationManager;

	    @Autowired
	    private MyUserService userService;

	    @GetMapping("/")
	    public String home() {
	        return "Welcome to login!!";
	    }

	    @PostMapping("/authenticate")
	    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception{

	        try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(
	                            jwtRequest.getUsername(),
	                            jwtRequest.getPassword()
	                    )
	            );
	        } catch (BadCredentialsException e) {
	            throw new Exception("INVALID_CREDENTIALS", e);
	        }

	        final UserDetails userDetails
	                = userService.loadUserByUsername(jwtRequest.getUsername());

	        final String token =
	                jwtUtility.generateToken(userDetails);

	        return  new JwtResponse(token);
	    }

}
