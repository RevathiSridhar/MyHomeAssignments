package week1.day2;

import java.util.Arrays;

public class FindMissingNumber {
	

	public static void main(String[] args) {
		
		int[] num= {1,4,3,7,8,6,2};
		Arrays.sort(num);
		//sort the array    {1,2,3,4,6,7,8}
		//index of the array 0 1 2 3 4 5 6
		for(int i=0;i<=num.length-1;i++) {
			if(num[i] != i+1) {
				System.out.println(i+1  + " " + "is the missing number");
				break;
			}
			
		}
	}

}
