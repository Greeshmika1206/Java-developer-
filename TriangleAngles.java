package SelectionStatements;
import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three angles:");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The angles form a triangle.");
        } else {
            System.out.println("The angles do not form a triangle.");
        }
    }
}