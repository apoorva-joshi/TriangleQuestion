package com.triangle;

import java.util.ArrayList;

public class MainTriangle {

	public static void main(String[] args) {

		MaxTotal maxTotal = new MaxTotal();
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

		// define the path for the text file with extension
		String filePath = "input/trialtriangle.txt";

		// method to fetch the input from text file
		matrix = ReadInput.fetchInput(filePath);

		// method to calculate the max total from the input triangle
		int result = maxTotal.calculateMax(matrix);
		System.out.println("Max total of triangle= "+result);
	} 

}
