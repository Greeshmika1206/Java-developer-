package Method;

import java.util.Scanner;

public class SumOf2Numbers {

    // Method to calculate the sum of two numbers
    public static int sumOfNumber(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input variables
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calculate sum using the method
        int sum = sumOfNumber(a, b);
        
        // Output the sum
        System.out.println("The sum of a and b is: " + sum);
        
        // Check if the sum is positive or negative
        if (sum > 0) {
            System.out.println("The sum is positive");
        } else  {
            System.out.println("The sum is negative");
        } 
        
        
    
    }
}
