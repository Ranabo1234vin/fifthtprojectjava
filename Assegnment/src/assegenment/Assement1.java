package assegenment;

public class Assement1 {
	{
		 display();
	}
    void display()
    {
    	System.out.println("this is display instance 1!");
    	display1();
    }
    void display1()
    {
    	System.out.println("this is display instance 2!");
    display2();
    }
    static void display2()
    {
    	System.out.println("this is display 1 static!");
    	display3();
    }
    static void display3()
    {
    	System.out.println("this is display 2 static!");
    }
	void main(String[] args) {
             
	}

}
