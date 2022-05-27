public class Main {
    public static void main(String args[]) {
     Company company=new Company();
     Worker work=null;
     PermanentEmployee pe=new PermanentEmployee();
     work=pe;
     company.working(work); 
     ContractorEmployee ce=new ContractorEmployee();
     work=ce;
     company.working(work);
     
   }
 }
