package br.com.renan.cancela.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.cancela.model.CancelaM;

public class CancelaD {

	private final Connection con;

	public CancelaD(Connection con) {
		this.con = con;
	}

	public boolean inserir(CancelaM cancela) throws SQLException {
		String sql = "INSERT INTO CANCELA (NOME, POSICAO) VALUES (?,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cancela.getNome());
		statement.setBoolean(2, cancela.isPosicao());
		return statement.executeUpdate() > 0;
	}

	public boolean abrir(String nome) throws SQLException {
		String sql = "UPDATE CANCELA SET POSICAO = 1 WHERE NOME = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, "nome");
		return statement.executeUpdate() > 0;

	}

	public boolean fechar(String nome) throws SQLException {
		String sql = "UPDATE CANCELA SET POSICAO = 0 WHERE NOME = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, "nome");
		return statement.executeUpdate() > 0;

	}

	public List<CancelaM> lista() throws SQLException {
		List<CancelaM> lCancela = new ArrayList<>();
		String sql = "SELECT * FROM CANCELA";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try(ResultSet rs = stmt.getResultSet()){
				while (rs.next()){
					String nome = rs.getString("NOME");
					boolean posicao = rs.getBoolean("POSICAO");
					lCancela.add(new CancelaM(nome, posicao));
				}
			}
	}
		return lCancela;
	}
}