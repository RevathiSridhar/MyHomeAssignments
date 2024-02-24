package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num =121;
		int r,output=0,temp = 0;
		temp = num;
		while(num >0) {
			r=num%10; //gives remainder
			output=(output*10)+r;
			num= num/10;
		}
		if(temp==output) {
			System.out.println(output + " " +"It is an Palindrome");
		} else {
			System.out.println(output + " " + "It is not a palindrome");
		}

	}

}
