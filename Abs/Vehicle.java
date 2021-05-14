package Abs;

//Abstract class 

public abstract class Vehicle 
{
	String type;
	public abstract long speed();
	public abstract void info();
	
	public Vehicle(String type) {
		this.type = type;
	}
	
}
