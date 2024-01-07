package week3.day2;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("API Endpoint for input is: "+endpoint);
	}
	
	//method overloading
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("API Endpoint for input is: "+endpoint);
		System.out.println("Request Body for input is: "+requestBody);
		System.out.println("Request Status is: "+requestStatus);
	}
	
	public static void main(String args[]) {
		
		//Inside the main method, create an object of the APIClient class.
		APIClient api = new APIClient();
		
		//Calling sendRequest method with 1 argument
		api.sendRequest("https://www.testleaf.com");
		
		//Calling overloaded sendRequest method with 3 arguments
		api.sendRequest("https://www.google.com","GET",true);
	}
}
