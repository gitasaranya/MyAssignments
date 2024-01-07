package week3.day3;
	
public interface DatabaseConnection {

	public void connect(String db);
	public void disconnect(String db);
	public void executeUpdate(int version);
	
}
