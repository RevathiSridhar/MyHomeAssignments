package week3.day1;

public class APIClient {
	
	//Method OverLoading --> Same Class, Same Method, Different Arguments
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint is"+" "+ endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println("The Endpoint is"+" "+ endpoint + "\n" + "The Requestbody is"+ " "+
	requestBody +"\n "+"The request Status is" + " "+ requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient endpoint = new APIClient();
		endpoint.sendRequest("https://facebook.com/");
		endpoint.sendRequest("https://facebook.com/", "Revathi Priyanka", "Sucess");
	}
}
