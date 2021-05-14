package Aso;

import java.util.*;

class State
{
	private String statename;

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	private List<City> cities;
	
	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}

public class Program3
{
	public static void main(String[] args) {
		
		State s = new State();
		s.setStatename("Maharashtra");
		System.out.println("name = "+s.getStatename());
		
	}

}