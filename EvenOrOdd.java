package Method;

public class EvenOrOdd {
		public static void main(String[] args) {
	   checkOddEven(5);                     
	   checkOddEven(6);
		}
	   public static void checkOddEven(int n) //Creating a method

		{
			if(n%2==0)               //condition to check whether the number is even or odd
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("Odd number");
			}
		}


	}


