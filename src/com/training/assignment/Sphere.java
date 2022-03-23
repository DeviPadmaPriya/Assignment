package com.training.assignment;

public class Sphere extends Circle implements Volume{


	
	Sphere(double radius, String name){
	super(radius, name);
		
	}

	@Override
	public double getVolume() {
		double Volume =(4/3);
		 Volume = (4/3)*super.getArea()*this.radius;
	     return Volume;
	}

}
