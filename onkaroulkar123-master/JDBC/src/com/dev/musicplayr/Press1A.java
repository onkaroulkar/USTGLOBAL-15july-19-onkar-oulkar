package com.dev.musicplayr;

import java.io.FileReader;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
//import java.util.Scanner;

public class Press1A {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	public void PlayAllSong() {
		// Scanner sc = new Scanner(System.in);
		Connection con = null;
		// PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ustglobal";
			String filePath = "C:\\Users\\more\\Desktop\\db.properties";

			FileReader reader = new FileReader(filePath);

			Properties prop = new Properties();
			prop.load(reader);

			con = DriverManager.getConnection(dbUrl, prop);

			String sql = "select * from musicplayr";
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String userdata = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4) + "    " + rs.getString(5);

				System.out.println(userdata);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
