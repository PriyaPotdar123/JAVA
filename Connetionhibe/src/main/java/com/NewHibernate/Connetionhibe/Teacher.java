package com.NewHibernate.Connetionhibe;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher
{
	@Id
	private int Tid; 
	private Fullname name;
	private String address;
	
	@OneToMany
	private List<Student> std=new ArrayList<Student>();
	
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public Fullname getName() {
		return name;
	}
	public void setName(Fullname name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Student> getStd() {
		return std;
	}
	public void setStd(List<Student> std) {
		this.std = std;
	}
	
	
}