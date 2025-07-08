// find the mini and max number of an array

package Arrays;

public class MiniAndMaxValueOfAnArray {

	public static void main(String[] args) {
		
		int arr[] = {12,13,4,1,0,-10};
		
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i]<arr[i+1]) {
//				System.out.println(i);
//			}
//		}
		
		int  smallest = arr[0], largest = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < smallest)
				smallest = arr[i];
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println(smallest + " is the smallest element in this Array");
		System.out.println(largest + " is the largest element in this Array");
	}
}
