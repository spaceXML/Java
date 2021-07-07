package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Customer {
	public static void main(String[] args) {
		getConnection();
	}
	
	public static void createTable () {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement(
					"Create Table in not Exitsts"
					+"customer(id int Not NuLL, Auto_Increment,"
					+ "name varChar(255),"
					+ "phone "
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public static Connection getConnection() {
		try {
			// 이부분에서 조심해야할것은 . 으로 찍을때 쉼표찍기 조심.
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6423478";
			String user = "sql6423478";
			String pass = "K85satcNpU";
			// 이부분에서 조심해야할것은 . 으로 찍을때 쉼표찍기 조심.
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
   