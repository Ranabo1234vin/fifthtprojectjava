package assegenment;

public class MethodwithArgumentsReturntype{

	public static void main(String[] args) {
		MethodwithArgumentsReturntype obj=new MethodwithArgumentsReturntype();
           int x=obj.add(10,20);
           System.out.println("Addition is:"+x);
           int y=obj.sub(x, 10);
           System.out.println("subraction is:"+y);
           int z=obj.mul(y,20);
           System.out.println("multiplication is:"+z);
           int a=obj.div(z, 20);
           System.out.println("division is:"+a);
	              

	}
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		return a/b;
	}

}
