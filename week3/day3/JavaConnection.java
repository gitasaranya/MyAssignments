package week3.day3;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jdbc = new JavaConnection();
		jdbc.connect("oracle");
		jdbc.executeUpdate(20);
		jdbc.disconnect("oracle");
	}

	public void connect(String database) {
		System.out.println("Connecting to the Database..."+database);
	}
	
	public void disconnect(String database) {
		System.out.println("Disconnecting from the Database..."+database);
	}
	
	public void executeUpdate(int version) {
		System.out.println("Executing Database updates...version "+version);
	}
}
