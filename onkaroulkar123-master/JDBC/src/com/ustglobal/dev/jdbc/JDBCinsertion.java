package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCinsertion {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");

			// get connection via Driver

			String dbUrl = "jdbc:mysql://localhost:3306/ustglobal";

			System.out.println("enter the username and password");
			String user = sc.nextLine();
			String password = sc.nextLine();

			con = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("connection estatblished");
			System.out.println("*******************************");

			// issue the sql query
			String query = "insert into user_info values(?,?,?,?)";
			pstmt = con.prepareStatement(query);

			System.out.println("enter the user id");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the username");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter the user mail...");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter the password");
			pstmt.setString(4, sc.nextLine());

			int count = pstmt.executeUpdate();

			// process the result
			if (count > 0)
				System.out.println("Query ok " + count + "row affected");
			else {
				System.out.println("someting went wrong");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
