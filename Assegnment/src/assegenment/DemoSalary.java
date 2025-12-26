package assegenment;
public class DemoSalary {
	String welcome() {
		return "welcome to Vcube software soluations";
	}

	int dailyRate() {
		return 1500;
	}

	int insurance() {
		return 750;
	}

	int baseSalary(int days) {
		int x = dailyRate() * days;
		return x;
	}

	int totalAmount(int days) {
		int total = baseSalary(days) + insurance();
		return total;
	}

	public static void main(String[] args) {
		DemoSalary E = new DemoSalary();
		String x = E.welcome();
		System.out.println(x);
		int total = E.totalAmount(10);
		System.out.println("total Amount :" + total);

	}

}
