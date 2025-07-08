package Abstraction;

public class Dog extends Animal{
	
	@Override
	public void speak() {
		System.out.println("Bark");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog Food");
	}
	
	@Override
	public void bite() {
		System.out.println("biting");
	}
}
