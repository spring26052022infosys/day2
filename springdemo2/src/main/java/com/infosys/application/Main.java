package com.infosys.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.bean.Welcome;
import com.infosys.configuration.ApplicationConfiguration;

public class Main {

	public static void main(String[] args) {
	 ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
       //Welcome wel=(Welcome)context.getBean("greet");
	  //  Welcome wel=(Welcome)context.getBean(Welcome.class); 
	 Welcome wel1=(Welcome)context.getBean("welcome"); 
	String message=wel1.hello();
	  System.out.println(message);
     Welcome wel2=(Welcome)context.getBean("welcome");
     System.out.println(wel1==wel2);
     System.out.println(wel1.equals(wel2));
     
     // Welcome wel1=new Welcome();
     // Welcome wel2=wel1;
	}
	

}
