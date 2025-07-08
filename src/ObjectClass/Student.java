package ObjectClass;

public class Student {
	
	String name;
	int rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo=rollNo;
	}
	
	@Override
	public String toString() {
		return "Name : " + name + "| RollNO : " + rollNo;	
	}

	public static void main(String[] args) {
		
		Student s = new Student("Mohit",52);
		System.out.println(s.toString());
	}
}
