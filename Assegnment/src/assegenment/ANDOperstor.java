package assegenment;

import java.util.Scanner;

public class ANDOperstor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		System.out.println("enter the attendence in persentage");
		int attendence=sc.nextInt();
		if(marks>=60 && attendence>=75)
		{
			System.out.println("your elgible for scholarship");
		}
		else
		{
			System.out.println("your not elgible for scholarship");
		}
		String x=(marks>40)?"pass":"fail";
		System.out.println("you are : "+x);
		sc.close();

	}

}
