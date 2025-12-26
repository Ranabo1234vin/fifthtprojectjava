package Assegenment2;
import java.util.Scanner;
class BankAccount {
       String accountHolder;
       int accountNumber;
       double balance;
 public void BankAccount123(String accountHolder1, int accountNumber1, double balance1) {
     accountHolder = accountHolder1;
     accountNumber = accountNumber1;
     balance = balance1;
 }
 public void displayAccount() {
     System.out.println("\n===== ACCOUNT DETAILS =====");
     System.out.println("Account Holder : " + accountHolder);
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Balance        : " + balance);
 }
 public void deposit(double amount) {
     balance += amount;
     System.out.println(amount + " Deposited Successfully!");
 }
 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println(amount + " Withdrawn Successfully!");
         return true;
     } else {
         System.out.println("Insufficient Balance!");
         return false;
     }
 }
 public double getBalance() {
     return balance;
 }
 public double calculateInterest(double rate,int time) {
     return (balance * rate*time) / 100;
 }
}
class Admin {
 private String adminPassword = "admin123";

 public boolean login(String password) {
     return password.equals(adminPassword);
 }

 public void updatePolicy() {
     System.out.println("Bank policy updated successfully!");
 }
}
public class OnlineBankingSystem {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     boolean account123 =false;
     BankAccount acount=null;
     Admin admin = new Admin();
     boolean x=true;
     while (x) {
         System.out.println("\n===== HDFC ONLINE BANKING SYSTEM =====");
         System.out.println("1. Create Account");
         System.out.println("2. Check Balance");
         System.out.println("3. Deposit Money");
         System.out.println("4. Withdraw Money");
         System.out.println("5. Calculate Interest");
         System.out.println("6. Admin Login");
         System.out.println("7. Display Account Details"); 
         System.out.println("8. Exit");                      // <<< Added menu option
         System.out.print("Enter Choice: ");
         int choice = sc.nextInt();

         switch (choice) {

             case 1:
                 sc.nextLine();
                 System.out.print("Enter Account Holder Name: ");
                 String name = sc.nextLine();

                 System.out.print("Enter Account Number: ");
                 int accNo = sc.nextInt();

                 System.out.print("Enter Initial Balance: ");
                 double bal = sc.nextDouble();

                 acount=new BankAccount();
                 account123=true;
                 acount.BankAccount123(name,accNo,bal);
                 System.out.println("Account Created Successfully!");
                 break;

             case 2:
                 if (account123 == false)
                     System.out.println("Create account first!");
                 else
                     System.out.println("Current Balance: " + acount.getBalance());
                 break;

             case 3:
                 if (account123 == false)
                     System.out.println("Create account first!");
                 else {
                     System.out.print("Enter Amount to Deposit: ");
                     double d = sc.nextDouble();
                     acount.deposit(d);
                 }
                 break;

             case 4:
                 if (account123 == false)
                     System.out.println("Create account first!");
                 else {
                     System.out.print("Enter Amount to Withdraw: ");
                     double w = sc.nextDouble();
                     acount.withdraw(w);
                 }
                 break;

             case 5:
                 if (account123 == false)
                     System.out.println("Create account first!");
                 else {
                     System.out.print("Enter Interest Rate per month (%): ");
                     double r = sc.nextDouble();
                     System.out.print("enter the months to calculate intrest:");
                     int t=sc.nextInt();
                     double interest = acount.calculateInterest(r,t);
                     System.out.println("Interest Amount per "+t+" months is: "+ interest);
                 }
                 break;

             case 6:
                 sc.nextLine();
                 System.out.print("Enter Admin Password: ");
                 String pwd = sc.nextLine();
                 boolean z=admin.login(pwd);
                 if (z) {
                     System.out.println("Admin Login Successful!");
                     admin.updatePolicy();
                 } else {
                     System.out.println("Invalid Password!");
                 }
                 break;

             case 7:
                 if (account123 == false)
                     System.out.println("Create account first!");
                 else
                     acount.displayAccount();
                 break;

             case 8:     
                 System.out.println("Thank you for using Online HDFC Banking System!");
                 x=false;
                 sc.close();
                 break;

             default:
                 System.out.println("Invalid Choice! Try Again.");
         } 
     }
 }
}
