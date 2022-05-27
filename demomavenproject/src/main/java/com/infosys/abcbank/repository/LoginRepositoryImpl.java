package com.infosys.abcbank.repository;

import java.util.HashMap;
import java.util.Map;

import com.infosys.abcbank.dto.CustomerDTO;

public class LoginRepositoryImpl implements LoginRepository{
	 public CustomerDTO validateUser(String userName)
     {
   	Map<String,String> userDetails=new HashMap<String,String>();
   	userDetails.put("ravi", "ravi1234");
   	userDetails.put("rakesh", "rakesh123");
   	String value=userDetails.get(userName);
   	CustomerDTO customerDTO=new CustomerDTO();
   	customerDTO.setUsername(userName);
   	customerDTO.setPassword(value);
   	return customerDTO;
     }
}

