package Poly;

public class Program1 {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.info();
		s1.printarea();
		s1.shapeobject();
		
		System.out.println("\n");
		
		s1 = new Circle(8);
		s1.info();
		s1.printarea();
		
		System.out.println("\n");
		
		s1=new Triangle(6,5);
		s1.info();
		s1.printarea();
	}

}
