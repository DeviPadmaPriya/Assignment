package com.demo.jdbc.prepareStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeData {


public static void main(String[] args)
{
	Connection con1 = null;
    PreparedStatement prSt = null;
    ResultSet rs = null;
	
		 try {
	    	  Class.forName("org.postgresql.Driver");
				String url = "jdbc:postgresql://localhost:5432/testdb";
				String userName = "postgres";
				String password="dpp@postgres";
				Connection con = DriverManager.getConnection(url,userName,password);
				    
				if(con!=null) {
					System.out.println("connected::") ;
					}
					else {
					System.out.println("not connected") ;
					}
					PreparedStatement stmt=con.prepareStatement("insert into Employees2 values(?,?,?,?,?)");  
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
					 
					do{  
					System.out.println("enter empno:");  
					String empno=br.readLine();  
					System.out.println("enter empname:");  
					String empname=br.readLine();  
					System.out.println("enter salary:");  
					int salary=Integer.parseInt(br.readLine());  
					System.out.println("enter Designation:");  
					String designation=br.readLine();  
					System.out.println("enter Department:");  
					String department=br.readLine();
					 
					stmt.setString(1,empno);  
					stmt.setString(2,empname);  
					stmt.setInt(3,salary);  
					stmt.setString(4,designation);  
					stmt.setString(5,department);
					int i=stmt.executeUpdate();  
					System.out.println(i+" records inserted");  
					 
					System.out.println("Do you want to continue: y/n");  
					String s=br.readLine();  
					if(s.startsWith("n")){  
					break;  
					}  
					}while(true);  
					PreparedStatement stmt1=con.prepareStatement("select * from employees where EMP_Desg='gm' and EMP_Dept='pmgmt'");  
					ResultSet rs1=stmt1.executeQuery();  
					while(rs1.next()){  
					System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getString(4)+" "+rs1.getString(5));  
					 
					con.close();  

					}  

					}

					catch(Exception e) {
					e.printStackTrace();
					}


					}


					}

			    
		          
	
     
		
    