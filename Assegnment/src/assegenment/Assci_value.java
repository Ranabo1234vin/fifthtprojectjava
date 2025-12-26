package assegenment;

public class Assci_value {

	public static void main(String[] args) {
		int x='A';
		System.out.println("Assci value of character A:"+x);

		int y='B';
		System.out.println("Assci value of character B:"+y);
		 
		int z='C';
		System.out.println("Assci value of character C:"+z);
		
		Assci_value obj=new Assci_value();
		obj.value('D');
		int i=(int) 'A';
		System.out.println(i);
		

}
	void value(char x)
	{
		System.out.println("Assci value of:"+x+":is:"+(float)x);
	}
	
}
