/* Write a program to search for a string in a file 
 * and then return the count of number of occurrences 
 * of the string.
 */

package com.training.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountRepeatedStrings {

	public static void main(String[] args) throws IOException {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string to be searched :");
			String searchStr = scanner.nextLine();
			BufferedReader br = new BufferedReader(new FileReader("temp"));
			int count = 0;
			String line;
			while((line = br.readLine()) != null) {
				String[] arr = line.split("\\s+");
				for(int i=0; i<arr.length; i++) {
					if(searchStr.equalsIgnoreCase(arr[i])) {
						count++;
					}
				}
			}
			System.out.println("The number of occurences of the strings is :"+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
