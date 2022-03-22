package com.training.assignment;

public class Box {
     int length;
     int breadth;
     int height;
	
     
     public Box(int length,int breadth,int height) {
    	 
    	  this.length =length;
    	  this.breadth=breadth;
    	  this.height=height;
    	
     }
	
	
	public int volume() {
		int volume = length*breadth*height;
		return volume;
		
		
	}
	
	public static void main(String[] args) {
		   Box b = new Box(5,4,3);
		   System.out.println("Volume of Box is:"+b.volume());
	

	}

}
