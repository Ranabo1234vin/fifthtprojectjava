package assegenment;
public class DemoMethods {

	public static void main(String[] args) {
		DemoMethods obj=new DemoMethods();
				obj.add(10,20);

	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of two numbers:"+c);
		sub(c,20);
	}
	void sub(int a,int b)
	{
	  int c=a-b;
	  System.out.println("subraction of two numbers:"+c);
	  mul(c,20);
	}
	void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication of two numbers:"+c);
		div(c,20);
	}
	void div(int a,int b)
	{
	   int c=a/b;
	   System.out.println("division of two numbers:"+c);
	   mod(c,20);
	}
	void mod(int a,int b)
	{
		int c=a%b;
		System.out.println("modulus of two numbers:"+c);
	}
}
