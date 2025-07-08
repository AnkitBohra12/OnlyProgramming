package Abstraction;

public class Square extends Shape{
	
	int side;
	
	Square(int side){
		this.side=side;
	}
	
	@Override	
	public double area() {
		return side*side;
	}
	
	@Override
	public double premeter() {
		return 4*side;
	}

}
