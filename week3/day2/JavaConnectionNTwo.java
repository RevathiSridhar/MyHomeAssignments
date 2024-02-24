package week3.day2;

public class JavaConnectionNTwo extends MySqLConnection {
	
	public void disconnect() {
		System.out.println("Concrete/Normal Class - Database Connected");
		
	}

	public void executeUpdate() {
		System.out.println("Concrete/Normal Class - Database updated");
		
	}

	@Override
	void executeQuery() {
		System.out.println("Concrete/Normal Class - Database query Updated");
		
	}

	public static void main(String[] args) {
		JavaConnectionNTwo dbData = new JavaConnectionNTwo();
		
		dbData.disconnect();
		dbData.executeUpdate();
		dbData.executeQuery();
		dbData.connect();
	}

	

}
