package simpleProjects;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
			for(int i = 1; i<=n ; i++) {
				for (int j = 0; j<=i-1; j++) {
				
					System.out.print("  ");
				}
				for (int k=0; k<=n-i ; k++) {
					
					System.out.print("* ");
				}
				
				System.out.println();
			}
		
			sc.close();


	}

}
