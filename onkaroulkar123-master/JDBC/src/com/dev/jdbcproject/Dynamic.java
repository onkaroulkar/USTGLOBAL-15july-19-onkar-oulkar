package com.dev.jdbcproject;

import java.sql.*;// step -1 import package

public class Dynamic {

	public static void main(String[] args) throws Exception {

		//Class.forName("com.mysql.jdbc.Driver"); // step 2 - load driver

		String url = "jdbc:mysql://localhost:3306/qspider";
		String user = "root";
		String password = "root";
		String query = "";

		Connection con = DriverManager.getConnection(url, user, password);// step 3 craete connection

		PreparedStatement pst = con.prepareStatement(query);// step 4 create statement

		ResultSet rs = pst.executeQuery();// step 5 store the result

		while (rs.next()) {
			String result = rs.getString(1) + " " + rs.getString(2);
			System.out.println(result);
		}

		pst.close();// step 6 close connection
		con.close();

	}

}
