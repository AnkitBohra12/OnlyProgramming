package PatternProgramming;

public class TreePattern {

	public static void main(String[] args) {
		
		int n = 11;
		for(int i = 1; i<=n+1; i++) {
			for (int j = 1; j<=n+1; j++) {
				if(i==1) {
					System.out.print("*");
				}
				else if(j == (n+1)/2 || j == (n+1)/2 + 1) {
					System.out.print("e");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
