package Java8;


interface Bulb
{
	void wattofbulb(int i);
	default String turnon()
	{
		return ("Bulb has turn on");
	}
	
	default String turnoff()
	{
		return ("Bulb has turn off.");
	}
}

interface Tubelight
{
	void wattoftubelight(int i);
	default String turnon()
	{
		return ("tubelight has turn on");
	}
	
		default String turnoff()
	{
		return ("tubelight has turn off.");
	}
}
public class DefaultTest implements Bulb,Tubelight {


	@Override
	public String turnon() {
		return (Bulb.super.turnon()+" and  "+Bulb.super.turnoff());
		
	}

	@Override
	public String turnoff() {
		return (Tubelight.super.turnon()+" and "+Tubelight.super.turnoff());
	}
	


	@Override
	public void wattoftubelight(int i) {
		System.out.println(i);
	}

	@Override
	public void wattofbulb(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		DefaultTest dt = new DefaultTest();
		System.out.println("Watts for Bulb and Tubelight are : ");
		dt.wattofbulb(40);
		dt.wattoftubelight(400);
		System.out.println(dt.turnon());
		System.out.println(dt.turnoff());
		
	}
}
