package ObjectClass;

public class Mobile {
	
	int ram;
	double price;
	String brand;
	
	Mobile(int ram, double price, String brand){
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		Mobile m = (Mobile)o;
		return this.brand == m.brand && this.price == m.price && this.ram == m.ram ;
	}
	
	@Override
	public String toString() {
		return "Brand : " + brand + " | Ram : " + ram + " | Price : " + price; 
	}

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(6,90000,"Dell");
		Mobile m2 = new Mobile(6,90000,"Dell");
		System.out.println(m1.equals(m2));
		System.out.println(m1.toString());

	}

}
