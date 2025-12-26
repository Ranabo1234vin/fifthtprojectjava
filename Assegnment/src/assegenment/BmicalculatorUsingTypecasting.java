package assegenment;
import java.util.Scanner;
public class BmicalculatorUsingTypecasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter weight in kgs=");
		double weight=sc.nextFloat();
		System.out.print("enter height in meters=");
		double heightmet=sc.nextFloat();
		double Bmi=(weight/((heightmet)*(heightmet)));
		int Bmi2=(int)Bmi;
		System.out.println("Body mass Index="+Bmi2);

	}
}
