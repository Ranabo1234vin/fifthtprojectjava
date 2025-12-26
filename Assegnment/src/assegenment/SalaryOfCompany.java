package assegenment;

public class SalaryOfCompany {
    double grossSalary;
    double newSalary;
    double netSalary;
    double earnedSalary;
    double gross(double basicSalary,double bonus)
    {    
    	grossSalary=basicSalary+bonus;
    	return grossSalary;
    }
    double net(double deduction,double basicSalary,double bonus)
    {
    	double gross=gross(basicSalary,bonus);
    	System.out.println("gross salary : 0"+gross);
    	double netSalary=gross-deduction;
    	return netSalary;
    }
    double perDaySalary(double basicSalary,double workingDays)
    {
    	double DaySalary=basicSalary/workingDays;
    	System.out.println("Day salary is: "+DaySalary);
    	return DaySalary;
    	
    }
    double earnedSalary(double basicSalary,double workingDays)
    {
    	double perDaySalary=perDaySalary(basicSalary,workingDays);
    	return perDaySalary*workingDays;
    }
    double remainingDays(double totalWorkingDays,double daysWorked)
    {
      double remainingDays=totalWorkingDays%daysWorked;
      return remainingDays;	
    }
    
	public static void main(String[] args) {
		SalaryOfCompany obj=new SalaryOfCompany();
		double netSalary=obj.net(100,20000,200);
		double earnedSalary=obj.earnedSalary(20000,10);
		double remainingDays=obj.remainingDays(20, 10);
		System.out.println("net Salary is  : "+netSalary);
		System.out.println("earnedSalary is : "+earnedSalary);
		System.out.println("remaining days is : "+remainingDays);
		
		
		
		

	}

}
