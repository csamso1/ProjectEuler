/**
 * @author Clayton Samson
 * Project Euler #11 solver
 * Highly Divisible Triangular Number Solver
 * Solves Project Euler Problem #: 12
 */

 import java.util.*;

 public class HighlyDivisibleTriangularNumber
 {
 	public static void main(String[] args)
 	{
 		// int num = 7;
 		int i = 1;
 		long numToTest = 0;
 		int numDivisors = 0;
 		// long testNum = triangularNumberCalc(num);
 		// System.out.printf("Triangular Number %d = %d\n", num, testNum);

 		while(true)
 		{
 			numToTest = triangularNumberCalc(i);
 			numDivisors = howDivisible(numToTest);
 			if(numDivisors >= 500)
 			{
 				System.out.printf("%d has %d divisors!\n", numToTest, numDivisors);
 				break;
 			}

 			i++;
 		}

 	}

 	//Calculates the nth triangular number
 	public static long triangularNumberCalc(int number)
 	{
 		long triangularNum = (number*(number + 1))/2;
 		return triangularNum;
 	}

 	//Determines how many divisors the given number has
 	public static int howDivisible(long num)
 	{
 		int numDivisors = 0;
 		for(int i = 1; i <= num; i++)
 		{
 			// System.out.printf("Checking if %d is divisible by %d\n", num, i);
 			if(num % i == 0){
 				numDivisors++;
 				// System.out.printf("Divisor found for %d, %d is dibisable by %d\n", num, num, i);
 			}

 		}
 		System.out.printf("%d has %d divisors.\n", num, numDivisors);
 		return numDivisors;
 	}
 }