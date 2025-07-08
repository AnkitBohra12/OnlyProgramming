package Abstraction;

public class DriverShape {
	
	public static void main(String[] args) {
		
		Shape s = new Square(5);
		System.out.println(s.area());
		System.out.println(s.premeter());
		
		s= new Rectangle(5,5);
		System.out.println(s.area());
		System.out.println(s.premeter());
	}
}
