package com.triangle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadInput {

	/*
	 * fetch and read input text file
	 * arguments: path of file
	 * return: list of integer list
	 */
	public static ArrayList<ArrayList<Integer>> fetchInput(String filePath){

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		
		try {
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line = bufferedReader.readLine();
			ArrayList<Integer> col = new ArrayList<>();
			
			// handles the first line of the triangle.
			col.add(Integer.parseInt(line));
			matrix.add(0,col);

			// handles the rest of the triangle
			int rowIndex = 1; 

			while((line = bufferedReader.readLine()) != null) {
				String[] tokens = line.split(" ");
				 col = new ArrayList<>();
				int i = 0;
				for(; i < tokens.length; i++) {					
					col.add(Integer.parseInt(tokens[i]));
				}
				
				// saving to list from text file
				matrix.add(rowIndex,col);
				rowIndex++;
			}

			bufferedReader.close();	
		} 
		catch (IOException | NumberFormatException e) {
			System.out.println("Error: "+e.getMessage());
			//exit program if error found
			System.exit(0);
		}
		
		return matrix;
	}

}
