package com.dev.project;

import java.sql.*;
import java.util.Scanner;

public class MethodImplementation implements Musicplayr {

	Scanner sc = new Scanner(System.in);

	@Override
	public void playAllSong() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		Statement st = con.createStatement();

		String query = "select * from musicfile";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			String data = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
			System.out.println(data);
		}

		st.close();
		con.close();

	}// end of main

	@Override
	public void playSongRandomly() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		Statement st = con.createStatement();

		String query = "select * from musicfile order by rand()";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			String data = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
			System.out.println(data);
		}

		st.close();
		con.close();

	}

	@Override
	public void playPerticularSong() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		String query = "select * from musicfile where songtitle=?";
		PreparedStatement pst = con.prepareStatement(query);
		System.out.println("enter song name");
		pst.setString(1, sc.nextLine());

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			String data = rs.getString(2);
			System.out.println(data);
		}

	}

	@Override
	public void searchSong() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		String query = "select * from musicfile where songtitle=?";
		PreparedStatement pst = con.prepareStatement(query);
		System.out.println("enter song name");
		pst.setString(1, sc.nextLine());

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			String data = rs.getString(2);
			System.out.println(data);
		}

	}

	@Override
	public void showAllSong() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		Statement st = con.createStatement();

		String query = "select * from musicfile";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			String data = rs.getString(2);
			System.out.println(data);
		}

		st.close();
		con.close();
	}

	@Override
	public void addSong() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		String query =  "insert into musicfile values(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		System.out.println("enter song id");
		pst.setInt(1, sc.nextInt());
		System.out.println("enter song name");
		pst.setString(2, sc.nextLine());
		System.out.println("enter artistname");
		pst.setString(3, sc.nextLine());
		System.out.println("enter song location");
		pst.setString(4, sc.nextLine());

		int rs = pst.executeUpdate();

		int i = pst.executeUpdate();
		if (i > 0) {
			System.out.println("song added");
		} else {
			System.out.println("enter correct data");
		}

	}

	@Override
	public void editeSong() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		String query = "update musicfile set songtitle=? where songid =?";
		PreparedStatement pst = con.prepareStatement(query);

		System.out.println("enter song name");
		pst.setString(1, sc.nextLine());
		System.out.println("enter song id");
		pst.setInt(2, sc.nextInt());

		
		int i = pst.executeUpdate();
		if (i > 0) {
			System.out.println("song updated");
		} else {
			System.out.println("enter correct data");
		}

	}

	@Override
	public void deleteSong() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/musicplayr";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);

		String query = "delete from musicfile where songid=?";
		PreparedStatement pst = con.prepareStatement(query);

		System.out.println("enter song id for song delete");
		pst.setInt(1, sc.nextInt());

	   
		int j = pst.executeUpdate();
		if (j > 0) {
			System.out.println("song updated");
		} else {
			System.out.println("enter correct data");
		}
	}

}
