package com.infosys.bean;

import org.springframework.stereotype.Component;

//@Component("greet")
//@Component(value="greet")
@Component
public class Welcome {
public String hello()
{
	return "Hello World";
}
}
