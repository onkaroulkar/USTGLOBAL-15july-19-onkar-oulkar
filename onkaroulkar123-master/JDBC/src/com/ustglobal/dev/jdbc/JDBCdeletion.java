package com.ustglobal.dev.jdbc;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCdeletion {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
             //loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");



			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ustglobal";
			String filePath = "C:\\Users\\more\\Desktop\\db.properties";

			FileReader reader = new FileReader(filePath);

			Properties prop = new Properties();
			prop.load(reader);



			con = DriverManager.getConnection(dbUrl, prop);
			System.out.println("connection estatblished");
			System.out.println("*******************************");

			//issues sql query
			String query = "delete from user_info where userid = ?"+"and password = ?";

			pstmt = con.prepareStatement(query);
			System.out.println("enter the user id for deletion");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password and deletion");
			pstmt.setString(2, sc.nextLine());

			int count = pstmt.executeUpdate();

			if(count>0)
			{
				System.out.println("Query Update "+count+"row affected");
			}
			else
			{
				System.out.println("something went wrong");
			}

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
