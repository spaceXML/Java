package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Customer {
	public static void main(String[] args) {
		getConnection();
		createCustomer("Dr.Kim","010-5555-5555","Male","62","Schedule memo....");
	}
	
//	public static ArrayList<String> getCustomers(){
//		try {
//			Connection con = getConnection();
//			PreparedStatement statment = con. prepareStatement("")
//			
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//		}
//	}
	
	
	
	
	public static void createCustomer (String name, String phone, String gender, String age,String note) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO customer"
					+ "(name, phone, gender, age, note)"
					+ " VALUE"
					+ "('" +name+"', '"+phone+"','"+gender+"', '"+age+"','"+note+"')");
			insert.executeUpdate();
		   System.out.println("The data has been saved!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void createTable () {
		try {
			Connection con = getConnection();
			PreparedStatement createTable = con.prepareStatement(
					"Create Table in not Exitsts"
					+"customer(id int Not NuLL Auto_Increment,"
					+ "name varChar(255),"
					+ "phone varChar(255),"
					+ "gender varChar(255),"
					+ "age varChar(255)," 
					+ "note varChar(255),"
					+ "PRIMARY KEY(id))");
			createTable.execute();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("Table successfully created");
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
   