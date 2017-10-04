package inf008.persistencia.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GenericDAOSQL {

	private static final String URI = "jdbc:postgresql://localhost:5432/java";
	private static final String USER = "postgres";
	private static final String PASS = "";
	
	private Connection conn = null;
	
	private Connection getConnection() throws SQLException{
		if(conn != null)
			return this.conn;
		DriverManager.registerDriver(new org.postgresql.Driver());
		this.conn = DriverManager.getConnection(GenericDAOSQL.URI, GenericDAOSQL.USER, GenericDAOSQL.PASS);
		return this.conn;
	}
	
}
