package com.infosys.abcbank.service;

import com.infosys.abcbank.dto.CustomerDTO;

public interface LoginService {

	String validateUser(CustomerDTO customerDTO);
}
