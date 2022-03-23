package com.training.assignment;

public class Result {

	

	public static void main(String[] args) {
	
		 Square sq =new Square(4,"A");
		 System.out.println("Area of Square is :"+ sq.getArea());
		 Circle ci =new Circle(2.3,"C");
		 System.out.println("Area of Circle is :"+ ci.getArea());
		 Cylinder cy =new Cylinder(2,6,"CY");
		 System.out.println("Volume of Cylinder is :"+ cy.getVolume());
		 Sphere sp =new Sphere(7,"S");
		 System.out.println("Volume of Sphere is :"+ sp.getVolume());
		 Cube cu =new Cube(3,"Q");
		 System.out.println("Volume of Cube is :"+ cu.getVolume());
		 Glome gl =new Glome(3.4,"A");
		 System.out.println("Volume of Glome is :"+ gl.getVolume());
		 

	}

}
