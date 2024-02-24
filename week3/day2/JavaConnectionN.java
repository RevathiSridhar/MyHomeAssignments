package week3.day2;

//Normal/Concrete class
public class JavaConnectionN implements DatabaseConnection {
	
	
	//Implements unimplemented methods
	public void connect() {
		System.out.println("Database Connected");	
	}

	public void disconnect() {
		System.out.println("Database DisConnected");
	}

	public void executeUpdate() {
		System.out.println("Database Execution got updated");	
	}
	
	public static void main(String[] args) {
		JavaConnectionN normalClass= new JavaConnectionN();
		normalClass.connect();
	}

	

}
