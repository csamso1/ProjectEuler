/**
 * @author Clayton Samson
 * Project Euler Problem #5 solution
 * Smallest Multiple Calculator
 */

import java.util.*;

public class SmallestMultiple
{
	//Start with 20
	static long numToCheck = 20;
	//Boolean to track if the number is divisable by 1 -> 20
	static boolean numIsDivisable = false;
	//Main Class
	public static void main(String[] args)
	{
		while(numIsDivisable == false)
		{
			if(isDivisable(numToCheck) == true)
			{
				System.out.printf("%d is divisable by 1 -> 20\n", numToCheck);
				numIsDivisable = true;
			}
			else
			{
				numToCheck++;
			}
		}
	}

	//Method for testing if an int is divisable by 1 -> 20
	public static boolean isDivisable(long num)
	{
		//Loop from 1 -> 20 checking divisability
		for(int i = 1; i <= 20; i++)
		{
			if(num % i != 0)
			{
				return false;
			}
		}
		return true;
	}
}