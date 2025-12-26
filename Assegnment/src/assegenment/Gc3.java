package assegenment;

public class Gc3 {

	public static void main(String[] args) {
		new Gc2();
		System.out.println("main end !");
		System.gc();

	}
	protected void finalize()
	{
		System.out.println("finalize method called !");
	}

}
