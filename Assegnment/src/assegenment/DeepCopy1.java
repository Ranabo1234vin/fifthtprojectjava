package assegenment;

public class DeepCopy1 {
	int id;
	String name;
	DeepCopy1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public DeepCopy1(DeepCopy1 obj) {
	//	 TODO Auto-generated constructor stud
		this.id=obj.id;
		this.name=obj.name;
	}
	void display()
	{
		System.out.println("id"+"   "+name);
	}
	public static void main(String args[])
	{
		DeepCopy1 obj=new DeepCopy1(101,"vinay");
		DeepCopy1 obj1=new DeepCopy1(obj);
		obj1.name="padma";
		obj.display();
		obj1.display();
		
	}
}
