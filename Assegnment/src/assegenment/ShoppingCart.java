package assegenment;

public class ShoppingCart {
	 String itemName;
	    double price;
	    int quantity;
	    double total;
	    double discountAmount;

	    // Static Block
	    static {
	        System.out.println("Shopping System Initialized");
	        System.out.println("----------------------------------");
	    }

	    // Constructor
	    ShoppingCart(String itemName, double price, int quantity) {
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Method to calculate total cost
	    double calculateTotal() {
	        total = price * quantity;
	        return total;
	    }

	    // Method to apply 10% discount
	    double applyDiscount(double total) {
	        discountAmount = total * 0.10; // 10% discount
	        return total - discountAmount;
	    }

	    // Method to display item details
	    void displayDetails() {
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price per Item: ₹" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total (Before Discount): ₹" + total);
	        System.out.println("Discount (10%): ₹" + discountAmount);
	        System.out.println("Total (After Discount): ₹" + (total - discountAmount));
	        System.out.println("----------------------------------");
	       
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Creating ShoppingCart objects
	        ShoppingCart item1 = new ShoppingCart("Laptop", 55000.0, 1);
	        ShoppingCart item2 = new ShoppingCart("Headphones", 2000.0, 2);

	        // Calculations for item1
	        double total1 = item1.calculateTotal();
	        item1.applyDiscount(total1);
	        item1.displayDetails();

	        // Calculations for item2
	        double total2 = item2.calculateTotal();
	        item2.applyDiscount(total2);
	        item2.displayDetails();
	    }
}
