package com.jspiders.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
	
	
		
			FileInputStream  fileInputStream = new FileInputStream("D:\\Fileoperations/demo.txt");
			
			ObjectInputStream ois= new ObjectInputStream(fileInputStream);
			
			Employee employee = (Employee)ois.readObject();
			
			System.out.println(employee.getName() +" "+employee.getAge()+ " "+employee.getContact());
	         	

		
		
		
		
		
		
	}
	
	
	
}
		
			
		