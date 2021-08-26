package com.project.Flyweight;

public class Circle implements Shape{
	
	private String color;
	private int x;
	private int y;
	private int radius;
	
	
	public Circle(String color) {
		super();
		this.color = color;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("circle of colour "+color+"\nradius "+radius+"\n x , y coordinates are "+x+y);
	}
	
}
