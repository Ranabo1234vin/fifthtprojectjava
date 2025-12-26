package assegenment;

public class Movie {
	static int x;
	{
		x++;
	}
	public static void main(String[] args) {
	    System.out.println("main method started!");
	    Movie obj=new Movie();
	    Movie obj1=new Movie();
	    System.out.println("objects count:"+x);
	}

}
