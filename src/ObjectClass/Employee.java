package ObjectClass;

public class Employee {
	
	String compId;
	int salary;
	String name;
	
	Employee(String compId, int salary, String name){
		this.compId = compId;
		this.salary = salary;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		
		return this.compId==e.compId && this.salary==e.salary && this.name == e.name;
	}
	
	@Override
	public int hashCode() {
		return compId.hashCode() + Integer.hashCode(salary) + name.hashCode();
	}
	
	@Override
	public String toString() {
		return "Name : " + name +  " | Company ID : " + compId + " | Salary : " + salary;	
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("TEST01",30000,"Rudra");
		Employee e2 = new Employee("TEST01",30000,"Rudra");
		Employee e3 = new Employee("TEST02",300000,"Rudra Narayan");
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.toString());

	}
}
