package com.project.ProxyPattern;

public class ProxyImage implements Image{
	String img_name;
	Realimage img;
	
	public ProxyImage(String img_name)
	{
		this.img_name=img_name;
	}

	public void display() {
		if(img==null)
		{
			img = new Realimage(img_name);
		}
		img.display();
	}

}
