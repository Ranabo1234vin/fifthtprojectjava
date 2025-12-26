package assegenment;
class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
}
class Emp extends Person
{
  double salary;
  int empid;
  Emp(String name,double salary,int empid)
  {   
	  super(name);
	  this.salary=salary;
	  this.empid=empid;
  }
  void display()
  {
	  System.out.println("name is     :"+name);
	  System.out.println("salary is   :"+salary);
	  System.out.println("empid is    :"+empid);
  }
}
/*class employe2 extends Emp
{
	String job;
	employe2(String name,double salary,int empid)
	{
		super(name);// it will call only parent class not grandfather class person
	}
	
	
}*/

public class Main {

	public static void main(String[] args) {
		Emp e1=new Emp("vinay",30000,101);
		e1.display();

	}

}
