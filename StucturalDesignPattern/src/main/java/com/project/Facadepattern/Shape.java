package com.project.Facadepattern;

public class Shape {
	private Rectangle rect;
	private Squar squar;
	private Circle circle;
	
	public Shape() {
		rect = new Rectangle();
		squar = new Squar();
		circle = new Circle();
	}

	public void drawCircle(){
	      circle.shape();
	   }
	   public void drawRectangle(){
	      rect.shape();
	   }
	   public void drawSquare(){
	      squar.shape();
	   }


}
