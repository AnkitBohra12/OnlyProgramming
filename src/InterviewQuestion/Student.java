// 1) create a class student write its properties, calculate grade of the student by obtained marks 
// by using methods

package InterviewQuestion;

public class Student {
	
	int rollno;
	String sname;
	int marks;
	
	Student(int rollno, String sname, int marks){
		this.rollno=rollno;
		this.sname=sname;
		this.marks=marks;
	}
	
	public String gradeObtained() {
		
		if(marks>80) {
			return "A";
		}
		else if(marks>60){
			return "B";
		}
		else if(marks>33){
			return "C";
		}
		else {
			return "F";
		}	
		
	}
	
	public void displayDetails() {
		System.out.println("Name : " + sname);
		System.out.println("rollno : "+ rollno);
		System.out.println("marks : "+ marks);
		System.out.println("grade : " + gradeObtained());
		System.out.println();
	}

	public static void main(String[] args) {
		
		Student s = new Student(25,"Sumit",85);
		s.displayDetails();
		
		Student s1 = new Student(1,"Amit", 30);
		s1.displayDetails();
		

	}

}
