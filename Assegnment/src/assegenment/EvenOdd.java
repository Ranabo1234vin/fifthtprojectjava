package assegenment;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("entered number "+num+" is even");
		}
		else
		{
			System.out.println("entered number "+num+" is odd");
		}
		sc.close();

	}

}
