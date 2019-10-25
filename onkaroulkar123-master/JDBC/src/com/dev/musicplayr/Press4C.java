package com.dev.musicplayr;

import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class Press4C {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	public void deleteSong() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ustglobal";
			String filePath = "C:\\Users\\more\\Desktop\\db.properties";

			FileReader reader = new FileReader(filePath);

			Properties prop = new Properties();
			prop.load(reader);

			con = DriverManager.getConnection(dbUrl, prop);

			String query = "delete from musicplayr where songid = ?";
			pstmt = con.prepareStatement(query);

			System.out.println("enter the songid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			int count = pstmt.executeUpdate();

			// process the result
			if (count > 0)
				System.out.println(" " + count + "song deleted");
			else {
				System.out.println("someting went wrong");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
