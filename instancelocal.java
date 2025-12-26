public class instancelocal {

	void main(String[] args) {
		System.out.println("main method started !");
		 addition();

	}
	void addition()
	{
		int a=20;
		int b=40;
		System.out.println(a+b);
	}
	{
		System.out.println("instance method started !");
	}
        static {
           System.out.println("this is static block executed");
}

}
