package assegenment;

public class switchCase {

	public static void main(String[] args) {
	String x=getDay(4);
	System.out.println(x);

	}
	static String getDay(int x)
	{
		return switch(x)
				{
		case 1,2,3->"vinay";
		default->"invalid";
				};
	}

}
