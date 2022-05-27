package com.infosys.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.bean.HelloWorld;
import com.infosys.configuration.SpringConfiguration;

public class Application {
   public static void main(String args[]) {
    /* ApplicationContext is a IOC container which is being implemented by the class
      AnnotationConfigAplicationContext and while creating the object we are initialising
      it with the configuration information by passing the reference Configuration class */ 
     ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
      //HelloWorld hw=context.getBean(HelloWorld.class);
        HelloWorld hw=(HelloWorld)context.getBean("helloWorld");
        hw.greet();
   }
  }