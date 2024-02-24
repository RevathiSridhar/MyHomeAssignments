package week3.day2;

public abstract class MySqLConnection implements DatabaseConnection {
	
	//abstract Class
	abstract void executeQuery();
	
	public void connect( ) {
		System.out.println("Abstract Class - Database Connected");
	}

}
