package com.training.assignment;

public class Circle extends Shape {

	public double radius;
	public String n;

	 Circle(double radius, String n) {
		this.radius = radius;
		this.n=n;
	}
	
	

	public double getArea() {
		
		double Area=(radius*radius)*Math.PI;
		return Area;
		
	}
	
	

}
