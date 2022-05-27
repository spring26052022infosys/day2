package com.infosys.abcbank.controller;

import com.infosys.abcbank.dto.CustomerDTO;
import com.infosys.abcbank.service.LoginService;
import com.infosys.abcbank.service.LoginServiceImpl;

public class LoginController {

	LoginService loginService=new LoginServiceImpl();
	
	public String validateUser(CustomerDTO customerDTO) {
		String status=loginService.validateUser(customerDTO);
		return status;
	}

	
	
}
