package Abstraction;

public class Tiger extends Animal {
	
	@Override
	public void speak() {
		System.out.println("Roar");
	}
	@Override
	public void eat() {
		System.out.println("Eating meat");
	}
	@Override
	public void bite() {
		System.out.println("biting");
	}

}
