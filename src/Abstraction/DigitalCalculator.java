package Abstraction;

public class DigitalCalculator implements Calculator {
	
	@Override
	public int plus(int a,int b) {
		return a+b;
	}
	
	@Override
	public int minus(int a,int b) {
		return a-b;
	}
	
	@Override
	public double devide(int a,int b) {
		return a/b;
	}
	
	@Override
	public double percentage(int a,int b) {
		return (a/b)*100;
	}
	
	@Override
	public int power(int a,int b) {
		int power = 1;
		
		
	}

}
