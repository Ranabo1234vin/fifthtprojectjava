package assegenment;

public class Selling {
	static float totalamount=450;
	void Buying(int chocalate,int cockie)
	{
		int eachChocalate=15;
		int eachCockie=10;
	    float remainingAmount=totalamount-(eachChocalate*chocalate)-(cockie*eachCockie);
	    System.out.println(chocalate+"chocalates"+"  "+cockie+"cockies  "+"remaining amount:"+remainingAmount);
	}
    
	public static void main(String[] args)
	{
		Selling obj=new Selling();
		obj.Buying(10,5);
		obj.Buying(15, 10);

	}

}
