package assegenment;

public class Threedigits {

	public static void main(String[] args) {
		int x=543;
		int y=x/100;//100s
		int z=x/10; //10s
		//System.out.println(z);
		int a=z%10;//10s
		int s=x%10;//1s
		System.out.println("Hundreds is-"+y+"\n"+"Tens is-"+a+"\n"+"ones is-"+s+"\n");
		

	}

}
