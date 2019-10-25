package com.ustglobal.dev.jdbc;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// load the driver
			java.sql.Driver div = new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded....");

			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:"
					+ "3306/ustglobal?user=root&password=root";

			con = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Est......");

			String query = "select * from user_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				int userid = rs.getInt("userid");
				String username = rs.getString("username");
				String email = rs.getString("email");
				System.out.println(
						"user id = " + userid + " " + "username = " + username + " " + "" + "email = " + email);
				// System.out.println("******************************************************************************");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
