package exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] s = new int[5];
		
		try {
			System.out.print("Enter the number : ");
			
			for(int i=0; i<s.length;i++) {
				s[i] = sc.nextInt();
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("cannot acceess the index");
		}
		
		catch(InputMismatchException e) {
			System.out.println("please give the valid input");
		}
		sc.close();
		
		System.out.println(Arrays.toString(s));
	}
}
