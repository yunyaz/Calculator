import java.util.*;
public class Calculator {
	public static double add(double num1, double num2)
	{
		return (num1 + num2);
	}
	public static double subtract(double num1, double num2)
	{
		return (num1 - num2);
	}
	public static double multiply(double num1, double num2)
	{
		return (num1 * num2);
	}
	public static double divide(double num1, double num2)
	{
		if (num2 != 0)
			return (num1 / num2);
		return 0.0;
	}
	
	

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Input 2 numbers to add");
		
		double input1 = keyboard.nextDouble();
		
		double input2 = keyboard.nextDouble();
		
		double sum = Calculator.add(input1, input2);
		
		System.out.println("The sum is " + sum);
	}

}
