package br.com.renan.cancela.model;

public class CancelaM {

	private String nome;
	public boolean isPosicao(){
	return posicao;
	}
	
	public void setPosicao(String nome,boolean posicao){
		this.nome = nome;
		this.posicao = posicao;
	}
	private boolean posicao;
	
	public CancelaM(String nome, boolean posicao){
		this.nome = nome;
		this.posicao = posicao;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
