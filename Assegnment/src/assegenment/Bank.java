package assegenment;

public class Bank {
	static int Accountnum=123413;
	{
		Accountnum=Accountnum+1;
	}
	void  display(String name,float balance)
	{
		System.out.println("Account holder name:"+name);
		System.out.println("Account number:"+Accountnum);
		System.out.println("Account holder Blance:"+balance);
	}
	

	public static void main(String[] args) {
	 Bank obj=new Bank();
      obj.display("suresh",12000);
      Bank obj1=new Bank();
      obj1.display("ramesh",10000);
      Bank obj2=new Bank();
      obj2.display("vinay",12500);
	}

}
