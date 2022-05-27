
public class Main3 {

	public static void main(String[] args) {
		Address address=new Address();
		address.setHno(1);
		address.setStreetName("Amar Street");
		address.setCityName("Shillong");
		Employee emp=new Employee();
		emp.setId(1);
		
		emp.setAddress(address);
		System.out.println(emp);// Employee@515f550a
		

	}

}
