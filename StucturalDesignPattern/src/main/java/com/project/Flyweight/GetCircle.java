package com.project.Flyweight;

import java.util.HashMap;

public class GetCircle {
	String color;
	private static final HashMap<String,Shape> mapcircle= new HashMap<String,Shape>();
	
	public static Shape getcircle(String color)
	{
		Circle circle = (Circle) mapcircle.get(color);
		if(circle==null)
		{
			circle = new Circle(color);
			mapcircle.put(color, circle);
			System.out.println("creating new object of circle of colour "+color);
		}
		return circle;
	}

}
