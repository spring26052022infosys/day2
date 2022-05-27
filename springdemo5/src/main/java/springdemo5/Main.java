package springdemo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

public static void main(String[] args) {
	
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
    Employee emp=(Employee)applicationContext.getBean("employee");
    emp.setId(1);
    // Are we going to create a new object with new Address();
    //Address address=new Address();
     Address address=emp.getAddress();
     address.setHno(1);
     address.setStreetName("Netaji Road");
     address.setCityName("Dhanbad");
     System.out.println(emp.getId());
     address=emp.getAddress();
     System.out.println(address.getHno());
     System.out.println(address.getStreetName());
     System.out.println(address.getCityName());
    }

}
