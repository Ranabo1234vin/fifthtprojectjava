package assegenment;
class Vechile{
	 String brand;
	
	 Vechile(String brand)
	 {
		 this.brand=brand;
		 System.out.println("vechile constructor called");
	 }
}
class Car extends Vechile
{
   int modelYear;
  
   Car(String brand,int modelYear)
   {   
	   super(brand);
	   this.modelYear=modelYear;
	   System.out.println("child constructor called");
	   
   }
}
class ElectricCar extends Car {

	public ElectricCar(String brand, int modelyear) {
		super(brand,modelyear);
	}

	public static void main(String[] args) {
		ElectricCar obj=new ElectricCar("kia",2025);
		obj.show();
		

	}
	void show()
	{
		System.out.println("bransd is : "+brand);
		System.out.println("model of year : "+modelYear);
	}

}
