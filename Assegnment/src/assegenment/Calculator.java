package assegenment;

public class Calculator {
     void add(float a,float b)
     {
    	  System.out.println("Addition is="+(a+b));
     }
	public static void main(String[] args) {
		Calculator obj=new Calculator();
	obj.add(5,6);
	obj.mul(5,6);
	obj.sub(5,6);
	obj.div(5,6);

	}
	void mul(float a,float b)
    {
   	  System.out.println("multiplication is="+(a*b));
    }
	void sub(float a,float b)
    {
   	  System.out.println("subraction is="+(a-b));
    }
	void div(float a,float b)
    {
   	  System.out.println("division is="+(a%b));
    }

}
