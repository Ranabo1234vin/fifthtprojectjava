package assegenment;

public class CopyConstructor {
	int id;
	String name;
	String branch;
	CopyConstructor(int id,String name,String branch)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
	}
	CopyConstructor(CopyConstructor obj)
	{   
	    System.out.println("id is     :"+obj.id);	
	    System.out.println("name is   :"+obj.name);
	    System.out.println("branch is :"+obj.branch);
	}
	public static void main(String[] args) {
		CopyConstructor obj=new CopyConstructor(100,"vinay","computer applications");
		obj.display();
		CopyConstructor obj1=new CopyConstructor(obj);
	}
	void display()
	{
		System.out.println("id is      :"+id);
		System.out.println("name is    :"+name);
		System.out.println("branch is  :"+branch);
	}

}
