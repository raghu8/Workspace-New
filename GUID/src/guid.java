import java.sql.*;
import java.util.UUID;
import java.util.Random;

public class guid {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://192.168.1.116:3306/sms";

	// Database credentialsjdbc:mysql://192.168.1.116:3306/sms
	static final String USER = "devuser";
	static final String PASS = "devuser";

	public static final void main(String... aArgs) {

		for (int i = 1; i < 10; i++) {

			UUID VIN = UUID.randomUUID();

			log("VIN : " + VIN);

			// Struct.setString(vina, String.valueOf(VIN));
		}
	}

	public static void log(String vins) {
		System.out.println(String.valueOf(vins));
		Connection conn = null;
		Statement stmt = null;

		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Inserting records into the table...");
			stmt = conn.createStatement();

			String sql = "INSERT INTO testingtable "
					+ "VALUES ( 'HONDA' ,null , '" + vins + "')";
			stmt.executeUpdate(sql);

			System.out.println("Inserted records into the table...");

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}// do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");
	}// end main
}// end JDBCExample
