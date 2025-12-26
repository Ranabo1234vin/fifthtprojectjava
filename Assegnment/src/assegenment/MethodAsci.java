package assegenment;
import java.util.Scanner;
public class MethodAsci {

	public static void main(String[] args) {
		MethodAsci obj=new MethodAsci();
		Scanner sc=new Scanner(System.in);
		char x=65;
		System.out.println(x);
		System.out.println("enter the character: ");
		char b=sc.nextLine().charAt(0);
		int Assci=obj.chartoAssci(b);
        System.out.println("number of character "+b+" is "+Assci);
        
        System.out.println("----------------------------------------------------------------------");
        
        System.out.println("enter the number: ");
        int c=sc.nextInt();
        char num=obj.chartoAssci(65);
        System.out.println("Assci value of "+c+" is "+num);

	}
	int chartoAssci(char c)
	{
		int x=c;//char to integer automatically convert implicity type casting
		return x;
	}
	char chartoAssci(int x)
	{
	  char y=(char)x;//int to char we need to convert explicity type casting
	  return y;
	}

}
