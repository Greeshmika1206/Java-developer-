package Method;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for length and width
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Calculate area and perimeter
        int area = calculateArea(length, width);
        int perimeter = calculatePerimeter(length, width);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);


    }

    // Method to calculate area
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    // Method to calculate perimeter
    public static int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}