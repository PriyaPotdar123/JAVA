package com.NewHibernate.Connetionhibe;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private Fullname name;
	private int age;
	
	@OneToMany
	private List<Laptops> lapi = new  ArrayList<Laptops>();
	
	@ManyToOne
	private Teacher tech;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Fullname getName() {
		return name;
	}
	public void setName(Fullname name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Laptops> getLapi() {
		return lapi;
	}
	public void setLapi(List<Laptops> lapi) {
		this.lapi = lapi;
	}

	
}
