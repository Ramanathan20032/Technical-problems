package number_Pattern;

import java.util.Scanner;

public class P_sample12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		int limit = sc.nextInt();
		for(int i=limit;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}


}
/*
Enter the limit:5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/