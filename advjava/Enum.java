package advjava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enum {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		Enumeration e =v.elements();
		System.out.println("Enumeration");
		while(e.hasMoreElements())
		{
			int i = (Integer)e.nextElement();
			System.out.println(i);
		}
		System.out.println("\n");
		
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			int i = (Integer)itr.next();
			if(i==100)
				itr.remove();
		}
		System.out.println(" Iterator");
		System.out.println(v);
		System.out.println("\n");
		
		
		
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
		int i = (Integer)litr.next();
        
       
        if (i == 100)
            litr.remove();
          
        else if (i == 300)
            litr.add(60);
          
        else if (i == 400)
            litr.set(100);
		}
		System.out.println("List Iterator");
		System.out.println(v);
	}

}
