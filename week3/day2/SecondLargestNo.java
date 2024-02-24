package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNo {

	public static void main(String[] args) {
		
		//Declaring a Array
		int[] number = {3,2,11,4,6,7};
		
		//Converting array to a ArrayList
		List<Integer> num = new ArrayList<Integer>();
		for(int val:number) {
			num.add(val);	
		}
		
		//Print the ArrayList num Values
		System.out.print(num);
		
		System.out.println(" ");
		
		//Sort the given ArrayList
		Collections.sort(num);
		System.out.println(num);
		
		//Print the second Largest Number
		System.out.println("The Second Largest Number in the given ArrayList is" + " "+num.get(4));
	}

}
