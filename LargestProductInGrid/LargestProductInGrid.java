/**
 * @author Clayton Samson
 * Project Euler #11 solver
 * Largest Product in a grid solver
 * works for a 20x20 grid
 * Solves project euler problem correctly
 */

import java.util.*;
import java.io.*;

public class LargestProductInGrid
{
	static long maxProduct = 0;
	static int grid[][] = new int[20][20];

	//Main Class
	public static void main(String[] args) throws FileNotFoundException
	{
		//Begin Scanning in data from grid.txt
		Scanner scn = new Scanner(new File("grid.txt"));
		int i, j = 0;
		for(i = 0; i < 20; i++)
		{
			for(j = 0; j < 20; j++)
			{
				grid[i][j] = scn.nextInt();
			}
		}
		//Print statment for confirmation that data was scanned in correctly
		System.out.printf("Imported Grid: %s\n", Arrays.deepToString(grid));
		//END  importing data

		//Calculate all right products
		for(i = 0; i < 20; i++)
		{
			for(j = 0; j < 17; j++)
			{
				rightProduct(i, j);
			}
		}

		//Calculate all down products
		for(i = 0; i < 17; i++)
		{
			for(j = 0; j < 20; j++)
			{
				downProduct(i, j);
			}
		}

		//Calculate all Right Down Diagonal products
		for(i = 0; i < 17; i++)
		{
			for(j = 0; j < 17; j++)
			{
				rightDownDiagonalProduct(i, j);
			}
		}

		//Calculate all Right Up Diagonal products
		for(i = 3; i < 20; i++)
		{
			for(j = 0; j < 17; j++)
			{
				rightUpDiagonalProduct(i, j);
			}
		}

		//Calculate all Left Down Diagonal products
		for(i = 0; i < 17; i++)
		{
			for(j = 3; j < 20; j++)
			{
				leftDownDiagonalProduct(i, j);
			}
		}

		//Calculate all Left Up Diagonal products
		for(i = 3; i < 20; i++)
		{
			for(j = 3; j < 20; j++)
			{
				leftUpDiagonalProduct(i, j);
			}
		}

	}

	//Method to calculate the product to the right
	public static void rightProduct(int iIndex, int jIndex)
	{
		long currentProduct = 1;
		for(int i = 0; i < 4; i++)
		{
			currentProduct = currentProduct * grid[iIndex][jIndex];
			jIndex++;
		}

		if(currentProduct > maxProduct)
		{
			maxProduct = currentProduct;
			System.out.printf("New maxProduct found! new maxProduct: %d\n", maxProduct);
		}
	}

	//Method to calculate the product going down
	public static void downProduct(int iIndex, int jIndex)
	{
		long currentProduct = 1;
		for(int i = 0; i < 4; i++)
		{
			currentProduct = currentProduct * grid[iIndex][jIndex];
			iIndex++;
		}

		if(currentProduct > maxProduct)
		{
			maxProduct = currentProduct;
			System.out.printf("New maxProduct found! new maxProduct: %d\n", maxProduct);
		}
	}

	//Method to calculate the product of the Left Right Diagonal
	public static void rightDownDiagonalProduct(int iIndex, int jIndex)
	{
		long currentProduct = 1;
		for(int i = 0; i < 4; i++)
		{
			currentProduct = currentProduct * grid[iIndex][jIndex];
			jIndex++;
			iIndex++;
		}

		if(currentProduct > maxProduct)
		{
			maxProduct = currentProduct;
			System.out.printf("New maxProduct found! new maxProduct: %d\n", maxProduct);
		}
	}

	//Method to calculate the Right Up Diagonal Products
	public static void rightUpDiagonalProduct(int iIndex, int jIndex)
	{
		long currentProduct = 1;
		for(int i = 0; i < 4; i++)
		{
			currentProduct = currentProduct * grid[iIndex][jIndex];
			jIndex++;
			iIndex--;
		}

		if(currentProduct > maxProduct)
		{
			maxProduct = currentProduct;
			System.out.printf("New maxProduct found! new maxProduct: %d\n", maxProduct);
		}
	}

	//Method to calculate the Left Down Diagonal Products
	public static void leftDownDiagonalProduct(int iIndex, int jIndex)
	{
		long currentProduct = 1;
		for(int i = 0; i < 4; i++)
		{
			currentProduct = currentProduct * grid[iIndex][jIndex];
			jIndex--;
			iIndex++;
		}

		if(currentProduct > maxProduct)
		{
			maxProduct = currentProduct;
			System.out.printf("New maxProduct found! new maxProduct: %d\n", maxProduct);
		}
	}

	
	//Method to calculate the Left Up Diagonal Products
	public static void leftUpDiagonalProduct(int iIndex, int jIndex)
	{
		long currentProduct = 1;
		for(int i = 0; i < 4; i++)
		{
			currentProduct = currentProduct * grid[iIndex][jIndex];
			jIndex--;
			iIndex--;
		}

		if(currentProduct > maxProduct)
		{
			maxProduct = currentProduct;
			System.out.printf("New maxProduct found! new maxProduct: %d\n", maxProduct);
		}
	}
}