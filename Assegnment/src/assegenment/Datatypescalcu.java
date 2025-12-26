package assegenment;

public class Datatypescalcu {
    void Add(int i,int j)
    {
    System.out.println("Addition :"+(i+j));	
    }
    void sub(short a,short b)
    {
    System.out.println("subraction :"+(a-b));	
    }
    void mul(byte a,byte b)
    {
    	System.out.println("multiplication :"+(a*b));	
    	
    }
    void div(long a,long b)
    {
    	System.out.println("division :"+(a/b));	
    	
    }
	public static void main(String[] args) {
		 Datatypescalcu obj=new  Datatypescalcu();
		 obj.Add(100, 100);
		 obj.sub((short)256,(short)255);
		 obj.mul((byte)120,(byte)125);
		 obj.div((long)23456,(long)23456);

	}

}
