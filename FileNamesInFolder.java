/* Write a program to show list of all file names in a folder */

package com.training.file;

import java.io.File;

public class FileNamesInFolder {

	public static void main(String[] args) {
		try {
			File folder = new File("src/com/training/file");
			if(!folder.exists()) {
				System.out.println("Folder doesn't exist ");
                System.exit(0);
            }
			File[] filesListArr = folder.listFiles();
			System.out.println("File names: ");
			for(int i = 0; i < filesListArr.length; i++) {
				System.out.println(filesListArr[i].getName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
