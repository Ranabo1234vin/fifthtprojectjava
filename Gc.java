public class Gc {
	public static void main(String[] args) {
	
		new Gc();
		System.out.println("main end!");
		System.gc();
		
	}
        @Override
	protected void finalize() throws Throwable{
		System.out.println("finalize called !");
	}
}
