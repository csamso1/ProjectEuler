/**
 * @author Clayton Samson
 * Project Euler #16 solver
 * PowerDigitSum Calculator
 */

import java.util.*;
import java.lang.*;
import java.math.*;

public class PowerDigitSum
{
	//MAIN Class
	public static void main(String[] args)
	{
		//Input scanner
		Scanner scn = new Scanner(System.in);
		System.out.printf("What is power you want to raise 2 by?\n");
		int power = scn.nextInt();
		System.out.printf("Power input: %d\n", power);

		//BigInteger Testing
		BigInteger two = new BigInteger("2");
		BigInteger result = two.pow(power);
		// BigInteger zero = new BigInteger("0");
		// BigInteger sum = new BigInteger("0");
		// long sum = 0;

		//Print statment for testing
		System.out.printf("2^%d = %s\n", power, result);

		//While Loop for calculating the sum of all digits
		// int i = 0;
		String strResult = result.toString();

		//Print statment for testing
		System.out.printf("strResult length = %d\n", strResult.length());

		LinkedList<Character> summation = new LinkedList<Character>();

		for(int i = 0; i < strResult.length(); i++)
		{
			System.out.printf("strResult.charAt(%d) = %s\n", i, strResult.charAt(i));
			summation.add(strResult.charAt(i));
		}
		
		//Prints linked list of digits to console
		System.out.printf("List of numbers to sum: %s\n", Arrays.toString(summation.toArray()));

		//Summs all items in the linked list
		int sum = 0;
		for(int i = 0 ; i < summation.size(); i++)
		{
			sum += Character.getNumericValue(summation.get(i));
			// sum += (int)summation.get(i);
			System.out.printf("sum += %s\n", summation.get(i));
			System.out.printf("Sum = %d\n", sum);
		}

		//Prints answer to console
		System.out.printf("Sum of all digits = %d\n", sum);
	}
}