package com.triangle;

import java.util.ArrayList;

public class MaxTotal {

	/*
	 * calculates the max total
	 * argument: list of integer list
	 * return: max total value
	 */
	public int calculateMax(ArrayList<ArrayList<Integer>> matrix){
		if(matrix == null || matrix.isEmpty() || matrix.size() <= 0){
			return 0;
		}
		// define array to save max 
		int[] maxArray = new int[matrix.size()];
		int l = matrix.size() - 1;
	 
		// inputing last row in maxArray
		for (int i = 0; i < matrix.get(l).size(); i++) {
			maxArray[i] = matrix.get(l).get(i);
		}

		// iterates from second last row
		for (int i = matrix.size() - 2; i >= 0; i--) {
			for (int j = 0; j < matrix.get(i).size(); j++) {				
				maxArray[j] = matrix.get(i).get(j) + Math.max(maxArray[j], maxArray[j + 1]);
			}
		}
		
		// first element will have the max total
		return maxArray[0];
	}
}
