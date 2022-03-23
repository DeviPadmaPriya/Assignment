package com.training.assignment;

public class Cylinder extends Circle implements Volume {
	
     private double height;
	
	
	 Cylinder(double radius,double height, String name) {
      super(radius,name);
		this.height = height;
	}
	@Override
	public double getVolume() {
		
		double Volume = super.getArea()*this.height;
		return Volume;
	}

	
}
