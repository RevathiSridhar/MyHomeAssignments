package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionElement {

	public static void main(String[] args) {

		List<Integer> List1 = new ArrayList<Integer>();
		List<Integer> List2 = new ArrayList<Integer>();
		List1.add(3);
		List1.add(2);
		List1.add(11);
		List1.add(4);
		List1.add(6);
		List1.add(7);
		
		//Print the List 1 values
		System.out.println("The List1 Values are" + List1);

		List2.add(1);
		List2.add(2);
		List2.add(8);
		List2.add(4);
		List2.add(9);
		List2.add(7);

		//Print the List 2 Values
		System.out.println("The List2 Values are" + List2);
		
		int length1 = List1.size();
		int length2 = List2.size();
		
		System.out.print("The Intersection Element values are"+" ");
		for(int i=0;i<length1;i++) {
			for(int j=0;j<length2;j++) {
				if(List1.get(i) == List2.get(j)) {
					System.out.print(List1.get(i)+ " ");
				}
			}
		}


	}

}
