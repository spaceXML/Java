package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
//		getConnection();
		//ó�� DB����κ�Ȯ�κκ�
		
		
		createTable();
//		------------------------�� ����------------------------------
//		createCustomer("Dr.kim", "123456789", "male","23" ,"Random Note....");
//		ArrayList<String> list = getCustomers();
//		for(String item: list) {
//			System.out.println(item);
//
//		}
//		createCustomer("Daived", "44411122211", "Female","25" ,"Important Customer");
//		list = getCustomers();
//		for(String item: list) {
//			System.out.println(item);
//		
//			
			
//			------------------------�� ����------------------------------
		}
	
	
	public static String[] [] getCustomers(){
					//ArrayList<String> ���� 2���迭������
					//string [] [] ���ٲٱ�
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select name, phone, gender, age, note From customer");
			ResultSet results = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
										//ArrayList<String[]> ���� 2���迭������
										//string [] [] ���ٲٱ�
										//String�� [] �� ������ []���ֱ�
			while(results.next()) {
				list.add(new String[] {
						results.getString("name"),		
						results.getString("phone"),
						results.getString("gender"),
						results.getString("age"),
						results.getString("note")
						
						});
				
//				String������ �ٲٱ� ���ؼ� �ؿ��� �������ϰ� �������� ����
			
//				list.add("Name: " + results.getString("name")+ 
//						" Phone "+ results.getString("phone") +
//					    " Gender: "+ results.getString("gender"));
			}
				System.out.println("the data has been fetched");
				String[][] arr = new String [list.size()][5];
				return list.toArray(arr);
				
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
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
