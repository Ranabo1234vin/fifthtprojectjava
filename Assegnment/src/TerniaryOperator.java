import java.util.Scanner;
public class TerniaryOperator {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		String grade=(marks>90 && marks<=100)?"A":
	    (marks>=80 && marks<=90)?"B":
	    (marks>=70 && marks<80)?"C":
		(marks>=50 && marks<70)?"D":
		(marks<50 && marks>=35)?"E":
		(marks>=0 && marks<=34)?"fail":"in valid";
		System.out.println("your grade is: "+grade);
		sc.close();
		
		

	}

}
