package assegenment;
import java.util.Scanner;
public class NextLine {

	public static void main(String[] args) {
	NextLine obj=new NextLine();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the gender:");
	char g=sc.nextLine().charAt(0);
	obj.gender(g);
	
	System.out.println("enter the state:");
	String state=sc.next();
	obj.statemethod(state);
	
	sc.nextLine();
	/* to avoid skipping we add this line
	 * if we have next in the middle 
	 * of nextLine after the next 
	 * is skipping so we add this line
	 * 
	 * */
	
	System.out.println("enter the country:");
	String country=sc.nextLine();
	obj.countrtmethod(country);
	
	System.out.println("enter the city");
	String city=sc.nextLine();
	obj.citymethod(city);

	}
    void gender(char g)
    {
    	System.out.println("gender is:"+g);
    }
    void statemethod(String state)
    {
    	System.out.println("state is:"+state);
    }
    void countrtmethod(String country)
    {
    	System.out.println("country is:"+country);
    }
    void citymethod(String city)
    {
    System.out.println("city is :"+city);
    }

}
