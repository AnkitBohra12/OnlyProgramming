// WJP to check occurance of an element in an array

package Arrays;

public class OccuranceOfArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,2,1,3};
		
		
		for(int i=0; i<a.length-1;i++) {			//  0 , 0<6 ,
			int count = 1;
			if(a[i]==Integer.MIN_VALUE) {			// a[i] = -1; // can take interger.min_value or 
				continue;							// 				we can take any number which is not inside 
				}									//				our given array
				for(int j=i+1; j<a.length; j++) {	//	1 , 1 < 6
					if(a[i]==a[j] /*&& a[i]!=Integer.MIN_VALUE*/) {						//  2==3
						count++;
						a[j]=Integer.MIN_VALUE;
					}
				}
			System.out.println(a[i] + "freq : " + count);
		}
	}
}
