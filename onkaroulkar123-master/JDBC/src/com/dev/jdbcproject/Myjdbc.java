package com.dev.jdbcproject;

import java.sql.*;// step -1 import package

public class Myjdbc {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // step 2 - load driver

		String url = "jdbc:mysql://localhost:3306/qspider";
		String user = "root";
		String password = "root";
		String query = " select * from data where username='shubham'";

		Connection con = DriverManager.getConnection(url, user, password);// step 3 create connection

		Statement st = con.createStatement();// step 4 create statement

		ResultSet rs = st.executeQuery(query);// step 5 store the result

		while (rs.next()) {
			String result = rs.getString(1) + " " + rs.getString(2);
			System.out.println(result);
		}

		st.close();// step 6 close connection
		con.close();

	}

}
