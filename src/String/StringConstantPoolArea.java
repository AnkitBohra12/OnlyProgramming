package String;

public class StringConstantPoolArea {

	public static void main(String[] args) {
		
		String s = "hello";
		String s1 = "hello";
		
		System.out.println(s==s1);
		System.out.println(s.hashCode());	
		System.out.println(s1.hashCode());
	}

}
