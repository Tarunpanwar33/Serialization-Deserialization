package com.jspiders.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization1 {

	  
	public static void main(String[] args) throws IOException {
		
		Students students = new Students("Tarun", 23, "tarun@gmailcom", 7505934782l);
		
		File file = new File("D:\\Fileoperations/test.txt");
		
		if (file.exists()) {
			
			System.out.println("file is already exists");
		}
		
		else {
			
			file.createNewFile();
			
			System.out.println("file is created succesfully");
		}
		
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
	
		    outputStream.writeObject(students);
		    
		    System.out.println("object is written to the file");
		   
		     fileOutputStream.close();
		     outputStream.close();
	}
}
