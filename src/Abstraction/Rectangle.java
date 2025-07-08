package Abstraction;

public class Rectangle extends Shape{
	
	int length,breadth;
	
	Rectangle(int length, int breadth){
		this.breadth=breadth;
		this.length=length;
	}
	
	@Override
	public double area() {
		return length*breadth;
	}
	
	@Override
	public double premeter() {
		return 2*length+breadth;
	}

}
