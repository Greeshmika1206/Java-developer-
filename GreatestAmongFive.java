package SelectionStatements;
import java.util.Scanner;

public class GreatestAmongFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        if (num4 > greatest) {
            greatest = num4;
        }
        if (num5 > greatest) {
            greatest = num5;
        }

        System.out.println("The greatest among the five numbers is: " + greatest);
    }
}