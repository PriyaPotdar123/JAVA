package Encap;

public class Testencap {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		e.setId(1);
		e.setName("Priya");
		e.setSalary(20000);

		System.out.println("Id = "+e.getId());
		System.out.println("Name = "+e.getName());
		System.out.println("Salary = "+e.getSalary());
	}

}
