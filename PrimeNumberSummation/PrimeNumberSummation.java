/**
 * @author Clayton Samson
 * Project Euler #10 solver
 * Prime Prime Number Calculator
 */

import java.util.*;

public class PrimeNumberSummation
{
	//MAIN Class
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		StopWatch watch = new StopWatch();
		System.out.printf("What is cutoff number for Prime Number Summation?\n");
		int input = scn.nextInt();
		System.out.printf("Input #: %d\n", input);
		int numPrimesFound = 0;
		int numToTest = 2;
		long sum = 0;
		LinkedList<Integer> primes = new LinkedList<Integer>();
		//Start StopWatch tor research
		watch.start();
		//Loop to count prime numbers
		while(numToTest <= input)
		{
			if(isPrime(numToTest) == true)
			{
				primes.add(numToTest);
				System.out.printf("Prime Number Found! %d has been added to the list.\n", numToTest);
			}
			numToTest++;
		}
		for(int i : primes)
		{
			sum += i;
		}
		//Stops timer for testing purposes
		watch.stop();
		System.out.printf("Beggining to sum all prime numbers below 2 million.\n");
		System.out.printf("Sum of all prime numbers below %d is: %d\n", input, sum);
		System.out.printf("Total Runtime: %d ms / %d s\n", watch.getElapsedTime(), watch.getElapsedTime() / 1000);
	}

	//Method for checking if provided number is a prime number
	public static boolean isPrime(long num)
	{
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				// System.out.printf("%d is not a prime number, it is divisable by %d\n", num, i);
				return false;
			}
		}
		// System.out.printf("%d is a prime number!\n", num);
		return true;
	}
}