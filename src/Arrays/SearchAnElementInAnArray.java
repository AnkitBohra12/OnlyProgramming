// 4) Write a programme to search an element in an array

// This searching techquine is called linear search ///---> time complexity : more

package Arrays;

public class SearchAnElementInAnArray {
	
	public static boolean search(int[]ar, int element) {
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==element) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int[]i = {5,20,10,6,4,0};
		int e = 50;
		
		System.out.println(search(i,e));
	}

}
