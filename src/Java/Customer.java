package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class Customer {

	public static void main(String[] args) {
//		getConnection();
		//ó�� DB����κ�Ȯ�κκ�
		createTable();
		createCustomer("Dr.kim", "123456789", "male","23" ,"Random Note....");
		
	}
	public static void createCustomer(String name, String phone, String gender, String age, String note) {
		try {
			Connection con = getConnection();
			PreparedStatement insert =  con.prepareStatement(""
					+"INSERT INTO customer"
					+"(name, phone, gender, age, note) "
					+"VALUE "
					+"('"+name+"','"+phone+"','"+gender+"','"+age+"','"+note+"')");
			insert.executeUpdate();
			// �����͵��¼���
			// name+"','"+phone+"','"+gender+"','"+age+"','"+note+"'
			System.out.println("the data has been saved!");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//������ �ܼ��� �Էµǰ� ������ �߻��Ұ�� ������ �޼����ǰ�
			System.out.println("the data has been saved!");
		}
	}
	public static void createTable() {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement (
					"CREATE TABLE IF NOT EXISTS "
					+ "customer(id int NOT NULL AUTO_INCREMENT,"
					+ "name varChar(255),"
					+ "phone varChar(255),"
					+ "gender varChar(255),"
					+ "age varChar(255),"
					+ "note varChar(255),"
					+ "PRIMARY KEY(id))");
				create.execute();
		}catch(Exception e){
			//������ �ܼ�
			System.out.println(e.getMessage());
		}finally {
			//������ �ܼ��� �Էµǰ� ������ �߻��Ұ�� ������ �޼����ǰ�
			System.out.println("Table seccessfull clear 255");
		}
		
	}
	
//	public static ArrayList<String> getCustomers(){
//		try {
//			Connection con = getConnection();
//			PreparedStatement statement = con.prepareStatement("Select name, phone, gender From customer");
//			ResultSet results = statement.executeQuery();
//			ArrayList<String> list = new ArrayList<String>();
//			while(results.next()) {
//				list.add("Name: " + result.getString("name")+ 
//						" Phone"+ result.getString("phone") +
//					    "Gender: "+ results.getString("gender"));
//				)
//				
//			}
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//			// TODO: handle exception
//		}
//	}
	
	
	
	

	public static Connection getConnection() 
						
					{
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6423478";
			String user = "sql6423478";
			String pass = "K85satcNpU";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("connettion Secessfull");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
