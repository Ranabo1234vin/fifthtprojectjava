package assegenment;

public class Gc1 {
	public static void main(String[] args) {
	
		new Gc1();
		System.out.println("main method started !");
		System.gc();
		
	}
	protected void finalize(){
		System.out.println("finalize called !");
	}
}
