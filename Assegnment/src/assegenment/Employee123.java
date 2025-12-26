package assegenment;
public class Employee123 {
      int empid;
      String name;
      double salary;
      static String companyName="TechSoft pvt ltd";
      Employee123(int empid,String name,double salary)
      {
    	  this.empid=empid;
    	  this.name=name;
    	  this.salary=salary;
      }
      Employee123(Employee123 emp)
      {
    	  this.empid=emp.empid;
    	  this.name=emp.name;
    	  this.salary=emp.salary+200;
      }
      
	public static void main(String[] args) {
	        Employee123 obj=new Employee123(100,"vinay",25000);
			obj.show();
			Employee123 obj1=new Employee123(obj);
            obj1.show();
            obj.show();
	}
	void show()
	{   
		System.out.println("company name is:"+companyName);
		System.out.println("empid is : "+empid);
		System.out.println("ename is : "+name);
		System.out.println("salary is: "+salary);
		System.out.println("=====================================================");
		
	}

}
