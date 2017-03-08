/**
 * @author Clayton Samson
 * Project Euler Code
 * SumSquare Difference Calculator
 */

import java.util.*;

public class SumSquareDifference
{
	//MAIN Class
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.printf("Input number to calc difference from: ");
		int input = scn.nextInt();
		System.out.printf("Input #: %d\n", input);
		long squareSum = squareSum(input);
		long sumSquare = sumSquares(input);
		long difference = squareSum - sumSquare;
		System.out.printf("Difference: %d\n", difference);

	}

	public static long sumSquares(int input){
		// int sum = input;
		long sum = 0;
		int num = 1;
		for(int i = 1; i <= input; i++){
			num = i*i;
			sum = sum + num;
			//Print statment for testing
			// System.out.printf("sumSquares: num = %d sum = %d\n", num, sum);
		}
		System.out.printf("sumSquares returns %d\n", sum);
		return sum;

	}

	public static long squareSum(int input){
		// int i = input;
		//n*(n+1)/2 = sum
		long sum = input*(input + 1)/2;
		//Print statment for testing
		// System.out.printf("squareSum: Sum of 1+2+3+...+input = %d\n", sum);
		sum = sum * sum;
		System.out.printf("squareSum returns %d\n", sum);
		return sum;
	}
}