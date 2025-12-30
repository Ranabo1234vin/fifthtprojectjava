package assegenment;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		boolean x=true;
		while(x)
		{
			System.out.println("enter 1 for exist 2 for continue");
			Scanner sc=new Scanner(System.in);
			int y=sc.nextInt();
			if(y==1)
			{
				x=false;
				System.out.println("thank you visit again");
			}
			else 
			{
				System.out.println("enter your name");
				String name=sc.next();
			}
			
		}

	}

}
