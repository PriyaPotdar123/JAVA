package com.project.Flyweight;

//fly weight pattern is used to restrict the multiple object creation
//if we are creating object of circle of exsisting color then it will not create object of that color 

public class Main {

	 private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	   public static void main(String[] args) {

	      for(int i=0; i < 20; ++i) {
	         Circle circle = (Circle)GetCircle.getcircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	      }
	   }
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }
}


