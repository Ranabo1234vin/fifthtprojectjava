package assegenment;

public class Constructorchaining {
    int sid;
    String sname;
    int age;
    Constructorchaining()
    {   
    	this(100);
    	
    }
    Constructorchaining(int sid)
    {   
    	this("vinay",23);
    	this.sid=sid;
    }
    Constructorchaining(String sname,int age)
    {
    	this.sname=sname;
    	this.age=age;
    }
    
	public static void main(String[] args) {
		Constructorchaining obj=new Constructorchaining();
		obj.display();
		obj.display();
		

	}
	void display()
	{
		System.out.println("student id is     :"     +sid);
		System.out.println("student name is   :"     +sname);
		System.out.println("student age is    :"     +age);
	}

}
