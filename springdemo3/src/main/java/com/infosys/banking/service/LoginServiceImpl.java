package com.infosys.banking.service;

import org.springframework.stereotype.Service;

//@Component
@Service
public class LoginServiceImpl implements LoginService {

	public void authenticate() {
		System.out.println("I am authenticate method of Service");

	}

}
