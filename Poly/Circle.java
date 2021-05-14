package Poly;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius)
	{
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void info() {
		System.out.println("info about circle");
	}
	
	@Override
	public void printarea() {
		
		System.out.println("area = "+Math.PI*radius*radius);
	}

}
