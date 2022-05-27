package com.infosys.abcbank.interfeces;

import java.util.Scanner;

import com.infosys.abcbank.controller.LoginController;
import com.infosys.abcbank.dto.CustomerDTO;

public class UserInterface {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		CustomerDTO customerDTO=new CustomerDTO();
		
		System.out.println("Enter the username");
		String userName=scan.next();
		System.out.println("Enter the password");
		String password=scan.next();
		
		customerDTO.setUsername(userName);
		customerDTO.setPassword(password);
		
		
		LoginController loginController=new LoginController();
		String message=loginController.validateUser(customerDTO);
		if(message.equals("SUCCESS"))
		{
			System.out.println("Welcome to the application");
		}
		else
		{
			System.out.println("Wrong credentials");
		}
		
		
	}

	

}
