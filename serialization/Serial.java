package com.jspiders.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) throws IOException {
		
		Students students = new Students("Tarun", 24, "tarun@gamil.com", 7505934782l);
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\WEJA14\\operationsfiles/demo.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(students);
	    System.out.println("object states is transferd to the file");
	    fileOutputStream.close();
	    objectOutputStream.close();
	    
	    
		
	
	
	
	
	
	
	
	}
}
