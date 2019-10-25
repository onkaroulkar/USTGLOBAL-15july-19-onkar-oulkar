
import java.sql.*;//step 1
/*
 * 1-->import package--->java.sql
 * 2-->load and register driver--->com.mysql.jdbc.driver
 * 3-->create connection---> Use Connection interface
 * 4-->create statement-->use Statement interface
 * 5-->Execute query
 * 6-->result
 * 7--> close connection
 */

public class StudentJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
		String uname = "root";
		String pass = "root";
		String query = "select * from student ";

	  //  Class.forName("com.mysql.jdbc.Driver");//class forname telusko step 2

		Connection con = DriverManager.getConnection(url, uname, pass);//step 3

		Statement st = con.createStatement(); //create stetment step 4
		ResultSet rs = st.executeQuery(query);// 
//		
//		String query1="insert into student values (9,'rohini',11601478,'bengaluru')";
//		int rs1 = st.executeUpdate(query1);
//		System.out.println(rs1);
		

		while (rs.next()) {
			String userdata = rs.getInt(1) + "  " + rs.getString(2) + "  "
					+ rs.getInt(3) + "  " + rs.getString(4);

			System.out.println(userdata);
		}
		
		

		st.close();
		con.close();

	}

}
