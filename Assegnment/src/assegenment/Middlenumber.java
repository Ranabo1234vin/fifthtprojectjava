package assegenment;

public class Middlenumber {

	public static void main(String[] args) {
		int a=1221;
		int z=0;
		int v=a;
	   while(a!=0)
	   {    
		int y=a%10;
		    z=z*10+y;
		    a=a/10;
	   }
     if(z==v)
     {
    	 System.out.println("entered number is polindrome");
     }
     else
     {
    	 System.out.println("entered number is not polindrom");
     }
	}

}
