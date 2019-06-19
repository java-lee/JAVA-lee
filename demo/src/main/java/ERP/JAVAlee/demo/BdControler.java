package ERP.JAVAlee.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	public class BdControler {
	private Connection con;
	private void abriConexao(){ 
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
	public void inserirDados(String sql) throws SQLException{
		abriConexao();
		System.out.println("Sql sem retorno recebido : " + sql);
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("parte1");
		ps.execute();
		System.out.println("parte2");
		ps.close();
		System.out.println("parte3");
		fecharConexao();
		System.out.println("parte4");
	}
	public ResultSet receberDados(String sql) throws SQLException {
		System.out.println("Sql com retorno recebido : " + sql);
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		return(rs);
	}
}

