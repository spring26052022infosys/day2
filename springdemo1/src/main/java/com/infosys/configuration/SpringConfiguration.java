package com.infosys.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infosys.bean.HelloWorld;

@Configuration  
 public class SpringConfiguration{

  @Bean
   public HelloWorld helloWorld(){
     return new HelloWorld();
   }

 }  