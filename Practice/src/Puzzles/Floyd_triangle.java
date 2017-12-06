package Puzzles;

import java.util.Scanner;

public class Floyd_triangle {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter the number of rows : ");

		int r = in.nextInt();
		int n = 0,p=0;
		for(int i=0;i<r;i++){
			for(int j=0;j<=i;j++){
				System.out.print(++n + " ");
			}
			System.out.println();
		}
		
		
	}

}
