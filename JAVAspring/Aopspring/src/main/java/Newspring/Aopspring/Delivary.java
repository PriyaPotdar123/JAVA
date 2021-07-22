package Newspring.Aopspring;

import org.springframework.stereotype.Component;

@Component
public class Delivary {
	private int id;
	private String name;
	private String address;
	private String number;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void dispatched()
	{
		System.out.println("package has dispatched");
	}
	
	public void packagedelivary()
	{
		System.out.println("Your package is arrived to");
		System.out.println("id 		"+id);
		System.out.println("Name 		"+name);
		System.out.println("Address 	"+address);
		System.out.println("Number  	"+number);
	}

}
