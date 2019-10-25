import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpgradation {

	public static void main(String[] args) throws SQLException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			
			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ustglobal";
			
			System.out.println("enter the username and password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			
			con = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("connection estatblished");
			System.out.println("*******************************");
			
			// issue sql query
			String query = "update user_info set email = ?"+"where userid=? and password=?";
			
			pstmt = con.prepareStatement(query);
			System.out.println("enter the new email id...");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter user id");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password");
			pstmt.setString(3, sc.nextLine());
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				System.out.println("Query Update "+count+"row affected");
			}
			else
			{
				System.out.println("something went wrong");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
