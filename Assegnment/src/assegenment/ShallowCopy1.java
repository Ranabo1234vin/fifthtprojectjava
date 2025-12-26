package assegenment;

public class ShallowCopy1 {
	int id;
	String name;
	ShallowCopy1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("id"+"   "+name);
	}
	public static void main(String args[])
	{
		ShallowCopy1 obj=new ShallowCopy1(101,"vinay");
		ShallowCopy1 obj1=obj;
		obj1.name="padma";
		obj.display();
		obj1.display();
		
	}

}
