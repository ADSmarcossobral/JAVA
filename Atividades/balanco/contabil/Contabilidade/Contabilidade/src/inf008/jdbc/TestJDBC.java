package inf008.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	void run1() throws SQLException{
		DriverManager.registerDriver(new org.postgresql.Driver());
		System.out.println("Driver Registrado");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT id, saldo, nome, emUso, tipo"
										+ "FROM conta");
		while(rs.next()){
			int id = rs.getInt("id");
			double saldo = rs.getDouble("saldo");
			String nome = rs.getString("nome");
			boolean emUso = rs.getBoolean("emUso");
			char tipo = rs.getString("tipo").charAt(0);
			
			System.out.println(id + "--" + nome + "-->" + saldo + "." + emUso + "/" + tipo );
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	
	void run2(int id, double saldo, String nome, boolean emUso, String tipo) throws SQLException{
		DriverManager.registerDriver(new org.postgresql.Driver());
		System.out.println("Driver Registrado");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("INSERT INTO conta (id, saldo, nome, emUso, tipo)"
				+ " VALUES(" + id + "," + saldo + "," + nome + "," + emUso + "," + tipo);
		rs.close();
		stmt.close();
		conn.close();
	}
	
	void run3(int id, double saldo, String nome, boolean emUso, String tipo) throws SQLException{
		DriverManager.registerDriver(new org.postgresql.Driver());
		System.out.println("Driver Registrado");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "");
		System.out.println("Conectado!");
		PreparedStatement pStmt = conn.prepareStatement("INSERT INTO conta(id, nome, saldo, emUso, tipo)"
				+ " VALUES (?, ?, ?, ?, ?);");
		pStmt.setInt(1, id);
		pStmt.setString(2, nome);
		pStmt.setDouble(3, saldo);
		pStmt.setBoolean(4, true);
		pStmt.setString(5, tipo);
		pStmt.close();
		conn.close();
	}
	
	public static void main(String[] args) throws SQLException{
		TestJDBC app = new TestJDBC();
		app.run2(10, 0, "Caixa", true, "A");
		app.run3(15, 0, "Despesas", true, "P");
		app.run1();
	}
	
}
