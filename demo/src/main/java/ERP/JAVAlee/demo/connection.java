package ERP.JAVAlee.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.SQLException;
public class connection {
	String url= "jdbc:mysql://localhost:80/banco";
	String driver = "com.mysql.jdbc.Driver"; 
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,"root", "");
	}catch(SQLException e) {
		
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
