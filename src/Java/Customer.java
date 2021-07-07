package Java;

import java.sql.Connection;
import java.sql.DriverManager;

public class Customer {
	public static void main(String[] args) {
		getConnection();
	}
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6423478";
			String user = "sql6423478";
			String pass = "K85satcNpU";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("The Connection Sccessful");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
   