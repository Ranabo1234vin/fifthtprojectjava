package assegenment;

public class Calculator2 {

	 void add(float a,float b)
     {
    	  System.out.println("Addition is="+(a+b));
     }
	public static void main(String[] args) {
		Calculator2 obj=new Calculator2();
	float x=obj.mul(5,6);
	obj.add(x,6);
	obj.sub(5,6);
	obj.div(5,6);

	}
	float mul(float a,float b)
    {
   	  return a*b;
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
