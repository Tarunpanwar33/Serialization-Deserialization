package com.jspiders.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

 
	public static void main(String[] args) throws IOException {
		
		Employee employee = new Employee("Tarun", 23, "Dehradun", 7505934782l);
		
		File file = new File("D:\\Fileoperations/test.txt");
		
		if (file.exists()) {
			
			System.out.println("File is already Exist");
		}
		
		else {
			
			file.createNewFile();
			System.out.println("File is created succesfully");
		}
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	     objectOutputStream.writeObject(employee);
	     System.out.println("object is written to the file");
	     fileOutputStream.close();
	     objectOutputStream.close();
  
	}

	    
	}
