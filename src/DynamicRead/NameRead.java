// print your full name with the help of scanner class

package DynamicRead;

import java.util.Scanner;

public class NameRead {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		
//		First name
		String a = sc.next();
		System.out.println("Name is : " + a);
		
//		Full name
		String an = sc.nextLine();
		System.out.println("Full name is : " + an);
		
	}

}
