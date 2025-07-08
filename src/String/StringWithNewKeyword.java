package String;

public class StringWithNewKeyword {

	public static void main(String[] args) {
		
		String s = new String("Java");
		String s1 = "Java";
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
