package com.training.assignment;

import java.util.Scanner;

public class StudentsMark {

	public static void main(String[] args) {
		
		int total=0;
		float Percentage;
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println( "Enter the Number of Students:");
		  int n =sc.nextInt();
		  for(int i=0;i<n;i++) {
			  Scanner s = new Scanner(System.in);
			  System.out.println("Enter the Name of Student :");
			  String name=s.nextLine();
			  
			  Scanner su = new Scanner(System.in);
			  System.out.println("Enter the total subjects :");
			  int t=su.nextInt();
			  
		      int arr[]=new int[t];
		      System.out.println("Enter the marks:");
		      
		      if(t>50) {
		    	  System.out.println("please enter valid marks..");
		      }
		      else if(t<0 ){
		    	  System.out.println("marks not valid...");
		      }
		      else {
		    	  
		    	  for(int j=0;j<t;j++) {
		    		  arr[i]=su.nextInt();
		    	  }
		       
		      }
		     
		    	 total=total +arr[t];
		    	 System.out.println("Total marks of the Student %s :"+total);
		    
		     Percentage=(total/t);
		     
		     System.out.println("Percentage of Student :" +Percentage);
		  }
		 
	} 
		  

	}


