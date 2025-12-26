package assegenment;

public class ObjectCount {
	static int count=0;
	
	ObjectCount()
	{
		count++;
	}
	public static void main(String[] args) {
		
		ObjectCount obj=new ObjectCount();
		ObjectCount obj1=new ObjectCount();
	    System.out.println("number of objects created: "+count);
	}

}
