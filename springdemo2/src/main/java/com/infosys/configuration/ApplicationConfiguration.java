package com.infosys.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.infosys.bean")//for searching/scanning 
// the package where the class is available
public class ApplicationConfiguration {

}
