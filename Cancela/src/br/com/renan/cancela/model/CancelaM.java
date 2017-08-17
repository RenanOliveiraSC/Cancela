package br.com.renan.cancela.model;

public class CancelaM {

	private boolean abrir;
	private boolean fechar;
	public String getPosicao(){
		return posicao;
	}
	
	public void setPosicao(String posicao){
		this.posicao = posicao;
	}
	private String posicao;
	
	public CancelaM(boolean abrir, boolean fechar, String posicao){
		this.abrir = abrir;
		this.fechar = fechar;
		this.posicao = posicao;
	}

	public boolean isAbrir() {
		return abrir;
	}

	public void setAbrir(boolean abrir) {
		this.abrir = abrir;
	}

	public boolean isFechar() {
		return fechar;
	}

	public void setFechar(boolean fechar) {
		this.fechar = fechar;
	}
	

}
