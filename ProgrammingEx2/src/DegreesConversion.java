/**
 * 
 */

/**
 * @author amanlapi
 *
 */
import java.util.Scanner;

public class DegreesConversion {
	private static Scanner input1;
	private static Scanner input2;

	// scanner object 1
	// private static Scanner input1;
	// first main method, input1 for fahrenheit
	public static void main(String[] args) {
		input1 = new Scanner(System.in);
		input2 = new Scanner(System.in);

		System.out.print(" Enter a degree in Fahrenheit: ");
		// declare and compute
		double fahrenheit1 = input1.nextDouble();
		double celsius1 = (fahrenheit1 - 32) * (5.0 / 9);
		// display results
		System.out.println(" Fahrenheit " + fahrenheit1 + " is " + celsius1 + " in Celsius. ");
		System.out.print(" Enter a degree in Celsius: ");
		double celsius2 = input2.nextDouble();
		double fahrenheit2 = (celsius2 * 9 / 5.0) + 32;
		System.out.println(" Celsius " + celsius2 + " is " + fahrenheit2 + " in Fahrenheit. ");
	}
}
