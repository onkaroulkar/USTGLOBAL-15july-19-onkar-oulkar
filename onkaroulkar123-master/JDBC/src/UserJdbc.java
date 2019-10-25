import java.sql.*; // step 1 import package

public class UserJdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");// step 2 register driver

		String url = "jdbc:mysql://localhost:3306/ustglobal?autoReconnect=true&useSSL=false";
		String uname = "root";
		String pass = "root";
		String query = "select * from user_info";

		Connection con = DriverManager.getConnection(url, uname, pass);// step 3 create connection

		Statement st = con.createStatement();// step 4 create statement

		ResultSet rs = st.executeQuery(query);// step 5 exicute query

		while (rs.next()) {
			String userdata = rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getString(3) + "  " + rs.getString(4);

			System.out.println(userdata);
		}

		st.close(); // step 6 close connection
		con.close();

	}

}
