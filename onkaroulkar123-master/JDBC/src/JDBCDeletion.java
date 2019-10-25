
import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		// loading the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded...");

			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ustglobal";
			String filepath = "C:\\Users\\more\\Desktop\\db.properties";

			FileReader reader = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(reader);

			conn = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection established...");
			System.out.println("*******************************************************");

			// Issue SQL Query
			String query = "DELETE FROM user_info WHERE userid = ? AND password = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter the user id for deletion");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password for deletion");
			pstmt.setString(2, sc.nextLine());

			int i = pstmt.executeUpdate();

			// process the results
			if (i > 0) {
				System.out.println("Query Ok, " + i + " row affected");
			} else {
				System.out.println("something went wrong...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // close all the JDBC objects
			if (conn != null) {
				try {
					conn.close();
					System.out.println("conection is closed...");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
					System.out.println("PreparedStatement is closed...");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			sc.close();
			System.out.println("Scanner is closed...");
		}

	}

}
