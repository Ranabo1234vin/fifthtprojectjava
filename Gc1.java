public class Gc {
	public static void main(String[] args) {
	
		new Gc();
		System.out.println("main end!");
		System.gc();
		
	}
	protected void finalize(){
		System.out.println("finalize called !");
	}
}
