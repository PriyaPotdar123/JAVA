package Abs;
interface Bike
{
	int speed(int a,int b);
	void info();
}
class Temp implements Bike {

	@Override
	public int speed(int distance,int time) {
		
		return distance/time;
	}

	@Override
	public void info() {
		System.out.println("this is interface bike");
		System.out.println("speed of bike is "+speed(100, 4));
	}
	public static void main(String[] args) {
		Temp t=new Temp();
		t.info();
	}

}
