package com.jspiders.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desrialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("D:\\Fileoperations/test.txt");
		
	   try (ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
		Students students = (Students)inputStream.readObject();
		    
		   System.out.println(students.getName() +" " + students.getAge()+ " "+students.getContact() );
	}
		
	}
}
