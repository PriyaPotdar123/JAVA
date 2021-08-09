package com.NewHibernate.Connetionhibe;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptops {
	
	@Id
	private int id;
	private String name;
	
	@ManyToOne
	private Student stud;
	
	
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
	
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "Laptops [id=" + id + ", name=" + name + ", stud=" + stud + "]";
	}
		
}
