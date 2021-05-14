package Abs;

public class Car extends Vehicle {
	long distance;
	long time;
	
	public Car(String type, long distance, long time) {
		super(type);
		this.distance = distance;
		this.time = time;
	}
	
	@Override
	public long speed() {	
		return distance/time;
	}
	@Override
	public void info() {
		System.out.println("Information about car");
		System.out.println("Car speed = "+speed());
		System.out.println("Vehicle type is "+type);
	}

}
