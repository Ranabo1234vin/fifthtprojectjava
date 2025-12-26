package assegenment;

public class Assement2 {
	@Override
	protected void finalize() throws Throwable {
	display();
	   
	}
	void display()
	{
		System.out.println("this is instance 1");
		display1();
	}
	void display1()
	{
		System.out.println("this is instance 2");
		display2();
	}
	static void display2()
	{
		System.out.println("this is static 1");
		display3();
	}
	static void display3()
	{
		System.out.println("this is static 2");
	}
    static
    {
    	     new Assement2();
    	     System.gc();
    }
	public static void main(String[] args) {

	}

}
