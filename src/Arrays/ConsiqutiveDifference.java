// find the difference of consiqutive difference of elements in an array
package Arrays;

public class ConsiqutiveDifference {

	public static void main(String[] args) {
		
		int []arr = {1,3,5,12,15};
//		int d = 0;
		
//		for(int i=0; i<arr.length-1;i++) {
//			for(int j=1; j<arr.length; j++) {
//				d = arr[j]-arr[i];
//			}
//			System.out.println(d);
//		}
		
		for(int i=0; i<arr.length-1 ; i++) {
			System.out.println(arr[i+1]-arr[i]);
		}	
	}
}


