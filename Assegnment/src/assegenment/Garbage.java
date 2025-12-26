package assegenment;

public class Garbage {
	@Override
	protected void finalize() throws Throwable {
	System.out.println("request to jvm for garbage collection");
	   
	}
	public static void main(String[] args) {
		Garbage e1=new Garbage();
		Garbage e2=new Garbage();
		Garbage e3=new Garbage();
		Garbage e4=new Garbage();
		e1=null;
		e2=e3;
		new Garbage();
		methodGarbage();
		System.gc();

	}
	 static void methodGarbage()
	{
		Garbage e5=new Garbage();
	}

}
