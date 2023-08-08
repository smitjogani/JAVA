package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {

	public static void main(String[] args) {
		//1.Load the drive 
		
		//2.establish the connection
		try
		{
			String url = "jdbc:mysql://localhost:3306/";
			String userName = "root";
			String password = "1909";
			 
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.print("connection Successfully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//3.create a statement
		//4.execute query
		//5.close the connection

	}

}
