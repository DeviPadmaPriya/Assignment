package com.training.assignment;

public class Square extends Shape implements Area {

	
	public double side;
	public String n;

	 Square(double side,String n) {
		this.side = side;
		this.n=n;
	
	}
	
	@Override
	public double getArea() {
		double Area= side*side;
		return  Area;
	}
	
	

}
