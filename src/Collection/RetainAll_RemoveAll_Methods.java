package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll_RemoveAll_Methods {

	public static void main(String[] args) {
		
		Collection b = new ArrayList();
		b.add("Dhoni");
		b.add("Virat");
		b.add("Jadeja");
		b.add("Hardik");
		b.add("Rohit");
		
		Collection a = new ArrayList();
		a.add("Hardik");
		a.add("Jadeja");
		a.add("Ashwin");
		
//		to remove all the common object from a collection we use RemoveAll
		
		b.removeAll(a);
		System.out.println(b);
		b.add("Ashwin");
		
		
//		To retain only the common object we use RetainAll
		
		b.retainAll(a);
		System.out.println(b);	

	}

}
