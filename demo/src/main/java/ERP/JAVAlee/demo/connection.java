package ERP.JAVAlee.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import java.sql.DriverManager;
import java.sql.SQLException;
	public class connection {
	private Connection con;
	public void abriConexao(){ 
		try {
			String url= "jdbc:mysql://localhost:3306/banco";
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
			this.con = DriverManager.getConnection(url,"root", "");
		}catch(SQLException e1) {
			System.out.println("Joooj: "+e1.getMessage());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void fecharConexao() {
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void inserirDados(String sql) {
		abriConexao();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.execute();
		fecharConexao();
	}
	public ResultSet receberDados(String sql) {
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return(rs);
	}
	public void setLogin() {
		
	}
}

