package SelectionStatements;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter temperaturein Fahrenheit: ");
		double fahrenheit=scanner.nextDouble();
		double celsius=(fahrenheit-32)*5.0/9.0;
		System.out.printf("%.2f fahrenheit is equal to %.2f celsius%n",fahrenheit,celsius);

	}

}
