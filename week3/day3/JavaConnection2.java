package week3.day3;

public class JavaConnection2 extends MySqlConnection {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection2 conn = new JavaConnection2();
		conn.connect("sql");
		conn.executeUpdate(30);
		conn.executeQuery("ACCOUNTS");
		conn.disconnect("sql");
	}

	@Override
	public void connect(String db) {
		// TODO Auto-generated method stub
		System.out.println("Connect to database "+db);
	}

	@Override
	public void disconnect(String db) {
		// TODO Auto-generated method stub
		System.out.println("Disconnect from the database "+db);
	}

	@Override
	public void executeUpdate(int version) {
		// TODO Auto-generated method stub
		System.out.println("Execute update for version number "+version);
		
	}

	@Override
	public void executeQuery(String tableName) {
		// TODO Auto-generated method stub
		System.out.println("Execute the query 'SELECT * FROM "+tableName);
	}

}
