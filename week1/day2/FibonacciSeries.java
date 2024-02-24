package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		//Initialize First number
		//Initialize Second Number
		int n1=0,n2=1,n3;
		int num=13;
		System.out.println(n1 +"\n" +n2);
			for(int i=2;i<num;i++) {
				n3= n1+n2;
				System.out.println("" + n3);
				n1=n2;
				n2=n3;
			}
	}
}
;