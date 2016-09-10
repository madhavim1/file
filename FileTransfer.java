/* Write a program to copy content of file into another file. */



package com.training.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTransfer {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("temp"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					new File("temp2.txt")));
			int ch;
			while((ch = br.read()) != -1) {
				bw.write(ch);
			}
			br.close();
			bw.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
