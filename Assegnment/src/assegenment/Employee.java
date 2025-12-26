package assegenment;

public class Employee {
	int id;
	String name;
	int sal;
	Employee(int id,String name)
	{   
		this(100,"vinay",2000);
		this.id=id;
		this.name=name;
	}
	Employee(int id,String name,int sal)
	{   
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	void display()
	{
		System.out.println("Employee id is :"+id);
		System.out.println("Employee name is :"+name);
		System.out.println("employe sal is :"+sal);
	}
	public static void main(String[] args) {
		Employee obj=new Employee(300,"ramesh");
		obj.display();
		System.out.println("==============================================");
		Employee obj1=new Employee(200,"tharun",5000);
		obj1.display();		
		

	}

}
