package inf008.persistencia.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import inf008.contabil.Ativo;
import inf008.contabil.Conta;
import inf008.contabil.Passivo;
import inf008.contabil.PatrimonioLiquido;
import inf008.persistencia.ContaDAO;

public class ContaDAOSQL implements ContaDAO {

	@Override
	public void save(Conta conta) throws Exception {
		DriverManager.registerDriver(new org.postgresql.Driver());
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "");
		PreparedStatement pStmt = conn.prepareStatement("INSERT INTO conta(id, nome, saldo, emUso, tipo)"
				+ " VALUES (?, ?, ?, ?, ?);");
		
		char tipo = 0;
		
		if(conta instanceof Ativo)
			tipo = 'A';
		else if(conta instanceof Passivo)
			tipo = 'P';
		else if(conta instanceof PatrimonioLiquido)
			tipo = 'L';
		pStmt.setInt(1, conta.getId());
		pStmt.setString(2, conta.getNome());
		pStmt.setDouble(3, conta.getSaldo());
		pStmt.setBoolean(4, conta.isEmUso());
		pStmt.setString(5, Character.toString(tipo));
		pStmt.close();
		conn.close();
	}

	@Override
	public void add(Conta conta) throws Exception {
		
	}

	@Override
	public void remove(Conta conta) throws Exception {
		
	}

	@Override
	public void ajustar(String nomeContaCredito, String nomeContaDebito, double valor) {
		
	}

	@Override
	public Conta findByName(String nomeContaCredito) {

		return null;
	}

	
	
}
