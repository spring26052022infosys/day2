package com.infosys.demo.autowire.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.demo.autowire.bean.Name;
import com.infosys.demo.autowire.bean.Student;
import com.infosys.demo.autowire.configure.ApplicationConfiguration;

public class Main{

    public static void main(String args[]) {
     ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
         Student student=(Student)context.getBean("student");  
                   student.setRoll(1);
         //Name name=(Name)context.getBean("name");
           
                  Name name= student.getName();   
                   System.out.println(name);
                   System.out.println(name.getFirstName()); //null
                   name.setFirstName("Ravi");
                   name.setLastName("Kumar");
                   name.setLastName("Sharma");
                  // student.setName(name);
                    name=student.getName();
                   System.out.println(name.getFirstName());
                

    }
 }
