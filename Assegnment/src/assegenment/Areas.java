package assegenment;
import java.util.Scanner;
public class Areas {

	public static void main(String[] args) {
		Areas obj=new Areas();
	Scanner	sc=new Scanner(System.in);
	System.out.println("enter the base:");
	double base=sc.nextDouble();
	System.out.println("enter the height:");
	double height=sc.nextDouble();
	double arrtri=obj.triangle(base,height);
	System.out.println("Area of triangle:"+arrtri);
	System.out.println("enter the side:");
	double side=sc.nextDouble();
	double arrsq=obj.square(side);
	System.out.println("Area of square:"+arrsq);
	System.out.println("enter the length:");
	double length=sc.nextDouble();
	System.out.println("enter the heigth:");
	double height1=sc.nextDouble();
	double arrrect=obj.rectangle(length, height1);
	System.out.println("Area of rectangle:"+arrrect);
	System.out.println("enter the radious:");
	double radious=sc.nextDouble();
	double arrcir=obj.circle(radious);
	System.out.println("Area of circle:"+arrcir);

	}
	double triangle(double base,double height)
	{
		return 0.5*base*height;
	}
	double square(double side)
	{
		return side*side;
	}
	double rectangle(double length,double height)
	{
		return length*height;
	}
	double circle(double radious)
	{
		return Math.PI*radious*radious;
	}
	

}
