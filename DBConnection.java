import java.sql.*;
public class DBConnection {
	private static Connection con = null;
	
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","rootuser");
		}catch(Exception e)
		{System.out.println(e);}
	}
	
	public static Connection getConnection() {
		return con;
	}

}
