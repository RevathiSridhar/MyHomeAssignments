package week3.day1;

public class ChangeOddIndex {

	public static void main(String[] args) {

		String test = "changeme";
		char[] ch= test.toCharArray();

		for ( int i =0; i <= test.length() -1 ; i++) {

			if(i%2==1) {

				System.out.print(Character.toUpperCase(ch[i]));
			}
			else {
				System.out.print(ch[i]);
			}
		}

	}

}
