package br.com.renan.cancela.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.renan.cancela.dao.CancelaD;
import br.com.renan.cancela.jdbc.oracle.ConnectionPoolOracle;
import br.com.renan.cancela.model.CancelaM;

public class CancelaS {

	public void inseri(CancelaM cancela) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CancelaD(con).inserir(cancela);
		}
	}
	
	public void abrir(String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new CancelaD(con).abrir(nome);
		}
	}
	
	public void fechar(String nome) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new CancelaD(con).fechar(nome);
		}
	}
	
	public List<CancelaM> listarCancelas() throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new CancelaD(con).lista();
		}
	}
}
