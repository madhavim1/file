/* Write a program to count the number of words in a file. */

package com.training.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("temp"));
		String line;
		int count = 0;
		try {
			while((line=br.readLine()) != null) {
				count += line.split("\\s+").length;
			}
			System.out.println("number of words in a file :"+count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
