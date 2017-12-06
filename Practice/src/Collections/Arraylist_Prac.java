package Collections;

import java.util.ArrayList;

public class Arraylist_Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Size of an arraylist
		int n = 5;
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(n);
		
		for(int i =0 ; i<n ; i++){
			arrlist.add(i);
		}
		
		arrlist.add(5);
		
		System.out.println("Arraylist is " + arrlist);
		
		//deleting array list
		//arrlist.remove(3);
		
		System.out.println("Arraylist after deletion is " + arrlist);

	}

}
