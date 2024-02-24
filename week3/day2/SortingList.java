package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		String[] companyNames =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> companyList = new ArrayList<String>();
		
		//Converting Array to Collection ArrayList
		for(String names: companyNames) {
			companyList.add(names);
		}
		System.out.println(companyList);
		
		//sort the collection list
		Collections.sort(companyList);
		System.out.println(companyList);
		
		//Get the length of the List
		int length = companyList.size();
		
		//Reverse Loop to Print in the reverse value
		for(int i =length-1;i>=0;i--) {
			System.out.print(companyList.get(i) + "," +" ");
		}
		

	}

}
