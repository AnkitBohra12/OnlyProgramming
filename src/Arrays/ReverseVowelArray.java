// 1) Create an array to store all the vowels and print it in reverse order

package Arrays;

public class ReverseVowelArray {

	public static void main(String[] args) {
		
		char[] arr = new char[5];
		
		arr[0]='a';											
		arr[1]='e';
		arr[2]='i';
		arr[3]='o';
		arr[4]='u';
		
//		for(int i=arr.length-1; i>=0;i--) 
		for(int i=4; i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}

