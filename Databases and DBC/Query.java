package JDBC;
 import  java.sql.*;
public class Query {

	public static void main(String[] args) {

		
		//Create an sql string
		String sql = "SELECT * from customer order by username";
		
		Statement statement;
		
		//Create a connection
		Connection conn;
		
		//Try to connect to database
		try {
			
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			statement = conn.createStatement();
			
			ResultSet results = statement.executeQuery(sql);
			
			//Iterate through database
			while(results.next()) {
				Long id = results.getLong("CUSTOMER_ID");
				 String username = results.getString("USERNAME");
				 String firstName = results.getString("FIRST_NAME");
				 String lastName = results.getString("LAST_NAME");
				 
				 System.out.println(id + " " + username + " " + firstName + " " + lastName);

			}
			
			if (results != null) {
				 results.close();
				 }
			if (statement != null) {
				 statement.close();
				 }
			conn.close();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
