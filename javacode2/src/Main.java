public class Main {
   public static void main(String args[]){
    Name name=new Name();
    name.setFirstName("Ravi");
    name.setMiddleName("Kumar");
    name.setLastName("Sharma");
    Student student=new Student();
    student.setRoll(1);
   // student.setName(name);
    System.out.println(student.getRoll());
    name=student.getName();
    System.out.println(name);  //null
    System.out.println(name.getFirstName());  // NullPointerException
    System.out.println(name.getMiddleName());
    System.out.println(name.getLastName());

  }
}
