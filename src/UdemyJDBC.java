//16-OCT-2026 : Aditya Dighe : Understanding JDBC in Java.

import java.sql.*;

public class UdemyJDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/* Steps for JDBC API cycle
		 * 1) Import the packages.
		 * 2) Load the driver
		 * 3) Register the driver
		 * 4) Create a connection.
		 * 5) Create a statement.
		 * 6) Execute the statement.
		 * 7) Close the connection.
		 */
		int sid = 2416008;
		String sname = "Sabari Raj";
		int marks = 100;
		
		String url = "jdbc:postgresql://localhost:5432/UdemyJDBC";
		String username = "postgres";
		String password = "aditya";
		String sqlQuery = "insert into student values (?,?,?)";
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection established !!");
		PreparedStatement pstmt = con.prepareStatement(sqlQuery);
		
		pstmt.setInt(1, sid);
		pstmt.setString(2, sname);
		pstmt.setInt(3, marks);
		
		pstmt.execute();
		
		con.close();
		System.out.println("Connection closed..");	
	}
}

	


