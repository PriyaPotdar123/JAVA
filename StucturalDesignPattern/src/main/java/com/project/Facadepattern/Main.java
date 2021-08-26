package com.project.Facadepattern;

//This pattern involves a single class which provides simplified methods 
//required by client 

public class Main {

	public static void main(String[] args) {
	
		Shape shape = new Shape();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}

}
