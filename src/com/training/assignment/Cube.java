package com.training.assignment;

public class Cube extends Square implements Volume {

   
	
     
	Cube(double side, String name) {
		super(side, name);
	}


	@Override
	public double getVolume() {
		
		double Volume = super.getArea()*this.side;
		return Volume ;
	}
	
	

}
