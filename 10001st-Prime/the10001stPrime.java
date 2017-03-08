/**
 * @author Clayton Samson
 * Project Euler #6 solver
 * 10001st Prime Number Calculator
 */

import java.util.*;

public class the10001stPrime
{
	//MAIN Class
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.printf("Which prime number do you want to find?\n");
		int input = scn.nextInt();
		System.out.printf("Input #: %d\n", input);
		int numPrimesFound = 0;
		long numToTest = 2;

		//Loop to count prime numbers
		while(true)
		{
			if(isPrime(numToTest) == true)
			{
				numPrimesFound++;
				System.out.printf("Prime Number Found! %d is the %dst prime number.\n", numToTest, numPrimesFound);
				if(numPrimesFound == input)
				{
					break;
				}
			}
			numToTest++;
		}
		System.out.printf("The %dth prime number is: %d\n", numPrimesFound, numToTest);
	}

	//Method for checking if provided number is a prime number
	public static boolean isPrime(long num)
	{
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				System.out.printf("%d is not a prime number, it is divisable by %d\n", num, i);
				return false;
			}
		}
		System.out.printf("%d is a prime number!\n", num);
		return true;
	}
}