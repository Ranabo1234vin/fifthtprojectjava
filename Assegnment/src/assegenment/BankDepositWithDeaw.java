package assegenment;

import java.util.Scanner;

public class BankDepositWithDeaw {
	static int Balance = 5000;

	void checkBalance() {
		System.out.println("Balance in your account: " + Balance);
	}

	void deposit(int amount) {
		Balance = Balance + amount;
		System.out.println("Deposite Amount:" + amount);
		System.out.println("total Amount: " + Balance);
	}

	void WithDrawAmount(int amount) {

		Balance = Balance - amount;
		System.out.println("with Draw Amount is:" + amount);
		System.out.println("total Amount:" + Balance);
	}

	public static void main(String[] args) {
		
		BankDepositWithDeaw user1 = new BankDepositWithDeaw();
		user1.checkBalance();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your Deposit Amount:");
		int DepositAmount = sc.nextInt();
		user1.deposit(DepositAmount);
		
		System.out.println("enter WithDraw Amount:");
		int withdraw = sc.nextInt();
		user1.WithDrawAmount(withdraw);

	}

}
