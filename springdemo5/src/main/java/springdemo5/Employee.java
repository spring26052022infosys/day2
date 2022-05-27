package springdemo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="employee")
public class Employee {
private int id;
@Autowired
private Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", address=" + address + ", getId()=" + getId() + ", getAddress()=" + getAddress()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
