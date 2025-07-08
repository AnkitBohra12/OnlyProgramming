package String;

public class PrintUnqiueChar {
	
	static void uniqueCharInAString(String s1) {		// apple 
														
		for(int i=0; i<s1.length() ;i++) {
			int count = 0; 
			char c = s1.charAt(i);
			if( c == i) {
				count ++;
				if(count == 2) {
					break;
				}
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		
		PrintUnqiueChar.uniqueCharInAString("Apple");

	}

}
