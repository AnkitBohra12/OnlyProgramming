// Create an array of int type with 7 numbers which return even number

package Arrays;

public class EvenNumberArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}

