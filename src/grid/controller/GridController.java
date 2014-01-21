package grid.controller;

import grid.model.Hipster;
import grid.view.GridView;

public class GridController
{
	private int [][] intNumbers;
	private String [][] stringWords;
	private GridView myView;
	private String [][] myHipsters;
	private Hipster [][] myBooks;
	
	public void start()
	{
		myView.printIntInformation(intNumbers);
		myView.printStringInformation(stringWords);
		myView.printHipsterInformation(myHipsters);
		myView.printHipsterBooks(myBooks);
	}
	
	public GridController()
	{
		intNumbers = new int [3][3];
		stringWords = new String [4][4];
		myHipsters = new String[2][2];
		myView = new GridView();
		myBooks = new Hipster[2][2];
		fillTheRandomNumbers();
		fillTheRandomWords();
		fillTheHipsterList();
		fillTheHipsterBooks();
	}
	
	private void fillTheHipsterList()
	{
		myHipsters[0][0] = "Your Mom";
		myHipsters[0][1] = "Steve";
		myHipsters[1][0] = "Napoleon";
		myHipsters[1][1] = "Pedro";
	}
	
	private void fillTheRandomNumbers()
	{
		intNumbers[0][0] = 0;
		intNumbers[0][1] = 1;
		intNumbers[0][2] = 2;
		intNumbers[1][0] = 3;
		intNumbers[1][1] = 4;
		intNumbers[1][2] = 5;
		intNumbers[2][0] = 6;
		intNumbers[2][1] = 7;
		intNumbers[2][2] = 8;
	}
	
	private void fillTheRandomWords()
	{
		stringWords[0][0] = "Sam";
		stringWords[0][1] = "Berry";
		stringWords[0][2] = "Devvin";
		stringWords[0][3] = "Nathan";
		stringWords[1][0] = "Jake";
		stringWords[1][1] = "Jarin";
		stringWords[1][2] = "Zack";
		stringWords[1][3] = "Steven";
		stringWords[2][0] = "Mckay";
		stringWords[2][1] = "Thomas";
		stringWords[2][2] = "Cody";
		stringWords[2][3] = "Ashley";
		stringWords[3][0] = "Lilly";
		stringWords[3][1] = "Shaelynn";
		stringWords[3][2] = "Ben";
		stringWords[3][3] = "Chloë";
	}
	
	private void fillTheHipsterBooks()
	{
		myBooks[0][0] = new Hipster();
		myBooks[0][1] = new Hipster();
		myBooks[1][0] = new Hipster();
		myBooks[1][1] = new Hipster();
	}
}
