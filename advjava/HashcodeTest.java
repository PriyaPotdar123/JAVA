package advjava;
//if we create two  objects of one class
//they will be equal, but they will return different hashCodes.
public class HashcodeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Priya");
		
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("Priya");
		
		System.out.println("Shallow copy "+(e1==e2));
		
		System.out.println("Deep copy "+(e1.equals(e2)));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
