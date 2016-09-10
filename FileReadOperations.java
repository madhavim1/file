/* Write a program that takes input from user dynamically 
 * using below classes.
 *     --> Scanner: Use this class to input 2 integer 
 *     				numbers and sum them. 
 *     --> BufferedReader and InputStreamReader: Use this classes 
 *              to input 2 integer numbers and subtract them.
 *     --> DatainputStream: Use this class to input 2 integer 
 *     numbers and multiply them.
 *     --> Console: Use this class to input 2 integer numbers 
 *     and divide them.
 *     */


package com.training.file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadOperations {
	
	public static void testScanner() {
		System.out.println("Testing Scanner... ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter another integer number: ");
		int num2 = scanner.nextInt();
		System.out.println("Sum of two numbers is: "+(num1+num2));
	}
	
	public static void testBuffReader() {
		System.out.println("Testing BufferedReader... ");
		try {
			BufferedReader br = new BufferedReader(new FileReader("temp"));
			int[] num = {0, 0};
			for(int i=0; i<2; i++) {
				String str = br.readLine();
				if(str == null || str.isEmpty()) {
					System.out.println("number is missing ");
					return;
				}
				num[i] = Integer.parseInt(str);
				System.out.println("num: "+(num[i]));
			}
			System.out.println("Subtraction of two numbers is: "+(num[0]-num[1]));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testDataInputStream() {
		System.out.println("Testing DataInputStream... ");
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("temp"));
			int[] num = {0,0};
			int i = 0;
			while(dis.available() > 0 && i<2) {
				String str = dis.readLine();
				num[i] = Integer.parseInt(str);
				System.out.println("num: "+(num[i]));
				i++;
			}
			System.out.println("Multiplication of two numbers is: "+(num[0]*num[1]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testConsole(String[] args) {
		System.out.println("Testing Console... ");
		if(args.length<2) {
			System.out.println("Arguments missing ");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("Division of two numbers is :"+(num1/num2));
	}

	public static void main(String[] args) {
		//testScanner();
		//testBuffReader();
		//testDataInputStream();
		testConsole(args);
	}

	

}
