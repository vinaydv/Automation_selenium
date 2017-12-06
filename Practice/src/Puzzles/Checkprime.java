package Puzzles;

import java.util.Scanner;

public class Checkprime {
	
	public boolean Checkprime1(int number){
		 boolean res=false;
		 
		 for(int a=2;a<number;a++){
			 if(number%a==0){
				 res = false;
				 break;
				
			 }
			 
			 else res = true;
			
		 }
		 
		 
		 return res;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Checkprime obj1 = new Checkprime();
		System.out.println("Enter the number to check prime or not: ");
		int p = in.nextInt();
		System.out.println(" The result is " + obj1.Checkprime1(p));

	}

}
