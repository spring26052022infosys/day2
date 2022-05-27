package com.infosys.abcbank.service;

import com.infosys.abcbank.dto.CustomerDTO;
import com.infosys.abcbank.repository.LoginRepository;
// The logic to check whether the user is a valid user or not
import com.infosys.abcbank.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService{

	private LoginRepository loginRepository= new LoginRepositoryImpl();
	public String validateUser(CustomerDTO customerDTO) {
		String status="ERROR";
		    CustomerDTO customerDTOFromMap=loginRepository.validateUser(customerDTO.getUsername());
		   		     if(customerDTOFromMap.getPassword()==null || !(customerDTOFromMap.getPassword().equals(customerDTO.getPassword())))
		      {
		    	  status="ERROR";
		      }
		     else if(customerDTOFromMap.getPassword().equals(customerDTO.getPassword()))
	    		{
	    	      status="SUCCESS";
	    	      
	    		}
		    	  return status;
	}

}
