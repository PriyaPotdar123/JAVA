package Poly;

public class Triangle extends Shape {
	private int side;
	private int base;
	
	public Triangle(int side,int base)
	{
		this.side=side;
		this.base=base;
	}

	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public void info() {
		System.out.println("info about triangle");
	}
	
	@Override
	public void printarea() {
		System.out.println("area = "+0.5*side*base);
	}

}
