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

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.print("Enter a 5-digit positive integer: ");
		int Number1, Remainder1;
		int Number2, Remainder2;
		int Number3, Remainder3;
		int Number4, Remainder4;
		int Number5, Remainder5;
		int Sum = 0;

		Number1 = input.nextInt();
		Number2 = input.nextInt();
		Number3 = input.nextInt();
		Number4 = input.nextInt();
		Number5 = input.nextInt();

		Remainder1 = Number1 % 10;
		Number1 = Number1 / 10;
		Remainder2 = Number2 % 10;
		Number2 = Number2 / 10;
		Remainder3 = Number3 % 10;
		Number3 = Number3 / 10;
		Remainder4 = Number4 % 10;
		Number4 = Number4 / 10;
		Remainder5 = Number5 % 10;
		Number5 = Number5 / 10;

		Sum = Sum + (Remainder1 + Remainder2 + Remainder3 + Remainder4 + Remainder5);

		System.out.format("sum:" + Sum);

	}
}

// how do i do this where it prompts for only one number? not 5 inputs of
// separate numbers?

/*
 * while( Number > 0) { Remainder = Number % 10; Sum = Sum + Remainder; Number =
 * Number / 10; } System.out.format("sum: "+ Sum); } }
 */
