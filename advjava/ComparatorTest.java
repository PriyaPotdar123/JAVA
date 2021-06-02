package advjava;
import java.util.*;  
import java.io.*;

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		arr.add(new Student(21,"priya"));
		arr.add(new Student(24,"payal"));
		arr.add(new Student(26,"geeta"));
		arr.add(new Student(22,"sneha"));
		arr.add(new Student(20,"neeta"));
		
		for(Student e:arr)
		{
			System.out.println(e.age+" "+e.name+" "); 
		}
		
		System.out.println("After sorting using Namecomparator");
		
		Collections.sort(arr,new NameComparator());  
		for(Student e:arr)
		{
			System.out.println(e.age+" "+e.name+" "); 
		}
		
		System.out.println("After sorting using Agecomparator");
		
		Collections.sort(arr,new AgeComparator());  
		for(Student e:arr)
		{
			System.out.println(e.age+" "+e.name+" "); 
		}
	}

}
