package Method;
import java.util.Scanner;

public class SimpleInterest {
	//method to calculate simple interst
	public static float calculateSimpleInterest(float principle,float rate,int time)
	{
		float si;
		si=(principle*rate*time)/100;    //calculate simple interest
		return si;                      //return simple interest
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //object of scanner class
		float principle,rate;
		int time;
		System.out.println("enter principle (in RS): ");
		principle=sc.nextFloat();
		System.out.println("enter rate (in %):  ");
		rate=sc.nextFloat();
		System.out.println("enter time(in year): ");
		time=sc.nextInt();
		float interest=calculateSimpleInterest(principle,rate,time);
		float amount=principle + interest;
		System.out.println("amount to be paid after charging simple Interest:Rs" +amount);
		
		

	}

}
