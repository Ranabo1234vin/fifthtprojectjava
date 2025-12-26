package assegenment;

public class Assem_Employee {
    
	static int empid=101;
	static String empname="vinay";
	static float salary=40000f;
	
	{
		salary=salary+salary*(10/100);
		System.out.println("employee name:"+empname);
		System.out.println("employee id:"+empid);
		System.out.println("employee salary:"+salary);
		
	}
			
	
	
	
	
	public static void main(String[] args) {
		Assem_Employee obj=new Assem_Employee();
		Assem_Employee obj1=new Assem_Employee();
		Assem_Employee obj2=new Assem_Employee();

	}

}
