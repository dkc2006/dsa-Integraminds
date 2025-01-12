package day_1_Basics_Of_Java;

public class Functions {
    // Example of code reusability
    // static void address() {
    //     System.out.println("Rakesh");
    //     System.out.println("No 32");
    //     System.out.println("Abc Street");
    //     System.out.println("Chennai");
    //     System.out.println("------------");
    // }

    int avail_bal = 5600; // Initial available balance

    public static void main(String[] args) {
        // Uncomment if address method needs to be called
        // address();
        // address();

        Functions fn = new Functions(); // Create an instance of Functions
        int x = fn.deposit(1400);       // Deposit amount and get updated balance
        System.out.println("Available Balance is " + x); // Print the balance
    }

    // Method to deposit an amount and return the updated balance
    int deposit(int deposit_Amt) {
        avail_bal = avail_bal + deposit_Amt; // Update the balance
        return avail_bal; // Return the new balance
    }
}
