package com.training.assignment;

import java.io.FileWriter;
import java.util.Scanner;

public class FileUser {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\ELCOT\\eclipse-workspace-CS\\javaAssignment\\Text.txt");
			Scanner s=new Scanner(System.in);
			System.out.println("Text HERE>>>");
			String st = s.nextLine();
			st=st.toUpperCase();
			fw.write(st);
			fw.close();
			s.close();
		}
	   catch(Exception e) {
		   System.out.println(e);
	   }
		System.out.println("successfully written");	
		}

	}


