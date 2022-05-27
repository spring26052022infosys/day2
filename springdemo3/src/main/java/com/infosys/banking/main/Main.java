package com.infosys.banking.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.banking.configuration.ApplicationConfiguration;
import com.infosys.banking.controller.LoginController;
import com.infosys.banking.service.LoginService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        LoginController controller=(LoginController)ac.getBean("loginController");
	    controller.authenticate();
	    LoginService service=(LoginService)ac.getBean("loginServiceImpl");
	    service.authenticate();
	}   

}
