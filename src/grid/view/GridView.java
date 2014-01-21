package grid.view;

import grid.model.Hipster;

public class GridView
{
	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("foreach printing numbers");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing numbers");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("foreach printing Names");
		for(String [] currentRow : currentArray)
		{
			for(String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing Names");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public void printHipsterInformation(String [][] currentArray)
	{
		System.out.println("foreach printing Hipster");
		for(String [] currentRow : currentArray)
		{
			for(String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing Hipster");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public void printHipsterBooks(Hipster [][] currentArray)
	{
		System.out.println("foreach printing Hipster Names");
		for(Hipster[] currentRow : currentArray)
		{
			for(Hipster currentString : currentRow)
			{
				System.out.print(currentString.getName() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing Hipster Books");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getHipsterBooks()[0] + "\t");
			}
			System.out.println();
		}
	}
	
}
