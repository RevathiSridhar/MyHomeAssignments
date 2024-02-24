package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		//Declaring a Array
		int[] numbers = {1,2,3,4,10,6,8};

		//Converting array to a ArrayList
		List<Integer> numberList = new ArrayList<Integer>();
		for(int val:numbers) {
			numberList.add(val);	
		}

		//Sort the array List
		Collections.sort(numberList);
		
		//Print the Size
		int length=numberList.size();
		
		System.out.print("The Missing Numbers are ");
		
		//Check the Missing Element
		for (int i = 0; i <length-1; i++) {
			if((numberList.get(i)+1)!=numberList.get(i+1)) {
				System.out.print(numberList.get(i)+1 + " ");
			}
		}


	}




}
