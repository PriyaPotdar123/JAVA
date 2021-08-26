package com.project.ProxyPattern;

public class Realimage implements Image{
	
	public String img_name;
	public Realimage(String img_name)
	{
		this.img_name = img_name;
		load(img_name);
	}

	public void load(String img_name)
	{
		System.out.println("loading new real image "+img_name);
	}

	public void display() {
		System.out.println("loading existing  "+img_name);			
	}
	
}
