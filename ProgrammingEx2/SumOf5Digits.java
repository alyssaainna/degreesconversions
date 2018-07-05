/**
 * 
 */

/**
 * @author amanlapi
 *
 */
//Scanner is in the java.util package
import java.util.Scanner; //import class

public class SumOf5Digits {
	public static void main(String[] args) {
		//Create a scanner 
		Scanner input = new Scanner(System.in);
		//Prompt for 5 digits
		System.out.print("Enter a 5-digit positive integer: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		int number5 = input.nextInt();
		//Compute sum
		int sum = (number1 + number2 + number3 + number4 + number5);
		//Display results
		System.out.println(" The sum of " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + "is " + sum);
		
	}

}
