package assegenment;

public class ArthematicAndAssignment {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Addition is:"+a+b);// output Addition is:1020
		System.out.println("Addition is:"+(a+b));// output Addition is:30
		//System.out.println("subraction is:"+a-b); output compile time error
		System.out.println("subraction:"+(a-b));// output subraction  is:-10
		System.out.println("multiplication is:"+a*b);// output multiplication is:200
		System.out.println("division is:"+a/b);// output Addition is:0 quoficent
		System.out.println("Addition is:"+a%b);// output remainder is:10
		int result=0;
		//result=result+3.5// it throws error
		//result +=3.5;
		//System.out.println(result);//output 3.5
		//result =result*3.5; compile time error
		//result *=3.5;
		//System.out.println(result);
		//result=3.5*10;//it throws compile time error
		//result -=10.5;// output -10
		//result=result+3.5;//compile time error 
		//result /=10.5;//output is 0;
		//System.out.println(result);
		//result=result/10.5;//compile time error
		//result=result%1.5;//compile time error
		result %=10.5;//output is 0;
		System.out.println(result);
		
	}

}
