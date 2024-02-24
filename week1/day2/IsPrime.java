package week1.day2;

public class IsPrime {
	
	public String isPrimeNumber(int num) {
		boolean isPrime = true;
		for(int i=2;i<=num-1;i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			} 
		}
		if(isPrime) {
			return num  +" " + "is an prime Number";
		} else {
			return num  +" " + "is not an prime Number";
		}
	}
	
	public static void main(String[] args) {	
		IsPrime obj = new IsPrime();
		System.out.println(obj.isPrimeNumber(19));
	}
}
