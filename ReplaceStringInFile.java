/*  Write a program to search for a string in a file 
 * and then replace it with another string.
 */

package com.training.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReplaceStringInFile {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string to be searched ");
			String searchStr = scanner.nextLine();
			System.out.println("Enter a string to be replaced ");
			String replaceStr = scanner.nextLine();
			BufferedReader br = new BufferedReader(new FileReader("temp"));
			
			String line;
			String fullStr="";
			while((line = br.readLine()) != null) {
				fullStr += line + "\n";
				System.out.println("line: "+line);
			}	
			System.out.println("string found: "+fullStr);
			FileWriter fw = new FileWriter("temp");
			fullStr = fullStr.replaceAll(searchStr, replaceStr);
			System.out.println("string found: "+fullStr);
			fw.write(fullStr);
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
