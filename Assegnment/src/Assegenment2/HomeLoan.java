package Assegenment2;

class HomeLoan {
    // Instance Variables
    String borrowerName;
    double loanAmount;
    int years;
    double totalRepay;

    // Static Block
    static {
        System.out.println("Home Loan Department Activated");
    }

    // Constructor
    HomeLoan(String name, double amount, int yrs) {
        borrowerName = name;
        loanAmount = amount;
        years = yrs;
    }

    // Method to calculate total repayment
    void calculateRepayment() {
        totalRepay = loanAmount + (0.08 * loanAmount * years);
    }

    // Method to show loan details
    void showDetails() {
        System.out.println("\nBorrower Name: " + borrowerName);
        System.out.println("Loan Amount: ₹" + loanAmount);
        System.out.println("Loan Duration (Years): " + years);
        System.out.println("Total Repayment Amount: ₹" + totalRepay);
    }

    // Main Method
    public static void main(String[] args) {
        // Creating two objects
        HomeLoan loan1 = new HomeLoan("Ravi Kumar", 500000, 5);
        HomeLoan loan2 = new HomeLoan("Anita Sharma", 800000, 10);

        // Calculate repayment
        loan1.calculateRepayment();
        loan2.calculateRepayment();

        // Display details
        loan1.showDetails();
        loan2.showDetails();
    }
}

