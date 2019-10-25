package com.dev.musicplayr;

import java.sql.*;

public class Press1 {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ustglobal";
		String user = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, user, password);

		String sql = "select * from musicplayr";
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			String userdata = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
					+ "    " + rs.getString(5);

			System.out.println(userdata);
		}

		st.close();
		con.close();

	}

}
