package com.training.assignment;

import java.util.Scanner;

public class MovieReservationApp {
	
	public static void main(String args[]) {
	
	System.out.println("''Welcome to Movie Reservation''");
	
	
	Scanner s=new Scanner(System.in);
	System.out.println(" Press num 1 for Movie Theatres Available");
    int n = s.nextInt();
    
    if(n==1) {
    	System.out.println("1.Karunya Theatre");
    	System.out.println("2.Anna Theatre");
    }
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    if(t==1) {
    	System.out.println("Movies in Karunya Theatre are....");
    	System.out.println(" 1.Paiyaa....");
    	System.out.println("2.Bigil.....");
    }
    else if(t==2)  {
    	System.out.println("Movies in Anna Theatre are:");
    	System.out.println("1.Insidious...");
    	System.out.println("2.PPk");
    	
    }
    
   switch(t){
   case 1:
	   Scanner e1=new Scanner(System.in);
	   int  s1 = e1.nextInt();
	   
	   if(s1 == 1) {
	   
	   Scanner c = new Scanner(System.in);
	   System.out.println("enter number of tickets you need for Paiyaa Movie:");
	   int m = c.nextInt();
	   System.out.println("Cost of tickets is: " +m*90);
	   System.out.println("'''Enjoy its Movie Time''");
	   }
	   else if(s1==2) {
		   Scanner c1 = new Scanner(System.in);
		   System.out.println("enter number of tickets you need for Bigil Movie:");
		   int m1 = c1.nextInt();
		   System.out.println("Cost of tickets is: " +m1*90);
		   System.out.println("'''Enjoy its Movie Time''");
		   }
	   
	   
   case 2:
	   
	   Scanner e2=new Scanner(System.in);
	   int  s2 = e2.nextInt();
	   
	   if(s2==1) {
	   Scanner d = new Scanner(System.in);
	   System.out.println("enter number of tickets you need for Insidious:");
	   int m2 = d.nextInt();
	   System.out.println("Cost of tickets is: " +m2*100);
	   System.out.println("'''Enjoy its Movie Time''");
	   }
	   else if(s2==2) {
		   Scanner d1 = new Scanner(System.in);
		   System.out.println("enter number of tickets you need for PPK:");
		   int m3 = d1.nextInt();
		   System.out.println("Cost of tickets is: " +m3*100);
		   System.out.println("'''Enjoy its Movie Time''"); 
	   }
	   
	
    }
    

}

	
}