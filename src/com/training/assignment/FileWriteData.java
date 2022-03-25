package com.training.assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriteData {
	
	public static void main(String[] args) throws IOException 
	{  
		try {
			
		String filepath = "C:\\Users\\ELCOT\\eclipse-workspace-CS\\javaAssignment\\Write.txt";	 
		 FileOutputStream file = new FileOutputStream(filepath);
		 String str = "Yeah! It's me...... Writing something in this file''''"; 
		   
		 byte bytearray[ ] = str.getBytes(); 
		  file.write(bytearray);    
		  file.close();    
		 
		  System.out.println("Successfully written");   
		  
		 }catch(Exception e){
		    System.out.println(e);
		  }    
		 }
		}