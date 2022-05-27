package com.infosys.banking.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.infosys.banking.controller com.infosys.banking.service com.infosys.banking.repository")
public class ApplicationConfiguration {

}
