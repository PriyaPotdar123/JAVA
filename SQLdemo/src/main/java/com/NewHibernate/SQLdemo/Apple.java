package com.NewHibernate.SQLdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Apple 
{
	@Id
	private int id;
	private String name;
	private int price;
	
	@Column(name = "rate")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
		
	
	
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
	
	@Override
	public String toString() {
		return "apple [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
