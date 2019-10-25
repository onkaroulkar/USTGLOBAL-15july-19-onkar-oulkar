package com.dev.musicplayr;

import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
//import java.util.Scanner;

public class Press1C {

//	public static void main(String[] args) {
//
//	}

	public void searchSong() throws Exception {
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

			// issue sql query
			String query = " select * from musicplayr where song_title like '%rh%'";

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				String userdata = rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
						+ rs.getString(4) + "    " + rs.getString(5);

				System.out.println(userdata);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
