package com.training.assignment;

public class Glome extends Sphere implements Volume  {

	Glome(double radius, String n) {
		super(radius, n);
		
	}

	@Override
	public double getVolume() {
		double Volume = 2*Math.pow(Math.PI, 2);
		Volume *= Math.pow(this.radius,3);
		return Volume;
	}

}
