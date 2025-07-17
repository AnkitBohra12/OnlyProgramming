package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();			// Upcasting
		c.add("java");
		c.add(65);
		c.add(6.8);
		c.add('C');
		c.add(true);
		
		System.out.println(c);
		
//		to copy one collection into 2nd collection
		
		Collection c1 = new ArrayList();
		c1.addAll(c);
		System.out.println(c1);
		
		
//		To remove an object from the collection 
		c1.remove("java");
		System.out.println(c1);
		
		
//		To search an obj from the collection/ OR containsAll to compare two collections
		c1.clear();  // to clear whole collection
		c1.addAll(c);
		System.out.println(c1.containsAll(c));
		System.out.println(c1.contains("java"));
		
		
//		Miscellaneous methods 
//		to check the size of a collection
		System.out.println(c1.size());
		
		
//		to check collection is empty or not
		System.out.println(c1.isEmpty());
		

	}

}
