// WJP to reverse a String with StringBuilder and without using reservse method

package StringBuilder;

public class ReverseAString {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("java is a platform independent language");	
		
		for(int i=0; i<s.length()/2; i++) {
			char first = s.charAt(i);					// 	j	
			char last = s.charAt(s.length()-1-i);		// 
			
			s.setCharAt(i,last);
			s.setCharAt(s.length()-1-i,first);
		}
		System.out.println(s);
	}
}
