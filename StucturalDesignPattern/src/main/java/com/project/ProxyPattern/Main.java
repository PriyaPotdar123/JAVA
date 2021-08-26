package com.project.ProxyPattern;

//proxy pattern is used to restrict/control the access to the original or main class

public class Main {
	public static void main(String[] args) {
		
		Image img1=new ProxyImage("nature.jpa");
		img1.display();
		
		System.out.println("-----------------------------");
		img1.display();
		
	}
}
