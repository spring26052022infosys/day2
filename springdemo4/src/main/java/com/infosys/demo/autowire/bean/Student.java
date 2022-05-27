package com.infosys.demo.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

  private int roll;
  @Autowired
  private Name name;
 // setters/getters method  
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public Name getName() {
	return name;
}
public void setName(Name name) {
	this.name = name;
}

}