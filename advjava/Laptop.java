package advjava;

public class Laptop implements Comparable<Laptop>{
	private int ram;
	private String name;
	private String brand;
	
	
	public Laptop(int ram, String name, String brand) {

		this.ram = ram;
		this.name = name;
		this.brand = brand;
	}
	
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", name=" + name + ", brand=" + brand + "]";
	}


	@Override
	public int compareTo(Laptop o) {
		if(o.ram==this.ram)
		{
			return 0;
		}
		if(o.ram<this.ram)
		{
			return 1;
		}
		else 
		return -1;
	}

}
