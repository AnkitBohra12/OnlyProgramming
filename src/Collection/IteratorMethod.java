package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorMethod {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();			
		c.add(23);
		c.add("Hello");
		c.add("Max Amini");
		c.add(true);
		c.add(254.00);
		
		Iterator i = c.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
