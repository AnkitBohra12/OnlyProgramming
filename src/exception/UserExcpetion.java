package exception;

import java.util.Scanner;

public class UserExcpetion extends NegativeTypeExcpetion {

	public static void main(String[] args) throws NegativeTypeExcpetion {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");	
		int i = sc.nextInt();
		
		if(i<0) {
			throw new NegativeTypeExcpetion();
		}
		
		else {
			System.out.println("Welcome to the Home page");
		}
		sc.close();
	}

}
