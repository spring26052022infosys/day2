package com.infosys.demo.autowire.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.infosys.demo.autowire.bean")
public class ApplicationConfiguration {

}