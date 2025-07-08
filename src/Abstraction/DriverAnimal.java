package Abstraction;

public class DriverAnimal {
	
	public static void main(String[] args) {
		
		Animal a = new Tiger();
		Animal a1 = new Dog();
		
		a.bite();
		a.eat();
		a.speak();
		
		a1.bite();
		a1.eat();
		a1.speak();
	}

}
