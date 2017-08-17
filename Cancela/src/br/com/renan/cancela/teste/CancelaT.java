package br.com.renan.cancela.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.renan.cancela.model.CancelaM;
import br.com.renan.cancela.service.CancelaS;

public class CancelaT {

	public static void main(String[] args) throws SQLException {
		
		CancelaS cancelaService = new CancelaS();
		
		//CancelaM cancela = new CancelaM("Saída", false);
		//cancelaService.inseri(cancela);
		
		//cancelaService.abrir("Entrada");
		cancelaService.fechar("Entrada");
		
		List<CancelaM> lCancela = cancelaService.listarCancelas();
		for (CancelaM can : lCancela) {
			imprimirCancela(can);

		}

	}

	private static void imprimirCancela(CancelaM can) {
		System.out.println("Cancela: " + can.getNome() + ", Posição: " + can.isPosicao());
	}
}
