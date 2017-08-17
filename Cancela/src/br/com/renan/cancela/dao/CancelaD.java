package br.com.renan.cancela.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.renan.cancela.model.*;

public class CancelaD {

	private final Connection con;

	public CancelaD(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(CancelaD cancela) throws SQLException {
		String sql = "INSERT INTO CANCELA (POSICAO) VALUES (?)";
			
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1,cancela.get);
	}
}
