package assegenment;

public class WraperObjectdatatypes {

	public static void main(String[] args) {
       System.out.println("auto boxing and auto unboxing for short");
		Short s=2000;
		short s1=s;// auto unboxing
		Short s2=s1; //  auto boxing
		System.out.println("auto boxing and auto unboxing for Byte");
		Byte b=100;
		byte b1=b; //auto unboxing 
		Byte b2=b1; //auto boxing
		System.out.println("auto boxing and auto unboxing for int");
		Integer i=20000000;
		int i1=i;// auto unboxing
		Integer i2=i1; //  auto boxing 
		Integer i3=30000;
		System.out.println(Integer.compare(10, 20));
		System.out.println("auto boxing and auto unboxing for Long");
		Long l=20000000000000000l;
		long l1=l;// auto unboxing
		Long l2=l1; //  auto boxing
		System.out.println("auto boxing and auto unboxing for float");
		Float f=45.6f;
		float f1=f;//auto unboxing
		Float f2=f1;//auto boxing
		System.out.println("auto boxing and auto unboxing for double");
		Double d=2300000.555555;
		double d1=d; //auto unboxing
		Double d2=d1; //auto boxing
		System.out.println("auto boxing and auto unboxing for char");
	    Character c='A';
	    char c1=c;//auto unboxing
	    Character c2=c;//auto boxing;
	    System.out.println("auto boxing and auto unboxing for boolean");
	    Boolean B=true;
	    boolean B1=B;// auto unboxing
	    Boolean B2=B1;//auto boxing
		

	}

}
