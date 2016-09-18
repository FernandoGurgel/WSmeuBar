package com.ifam.meubar.model.bean;

public class ProdutoBean{
	
	private int pcodigo;
	private String pdescricao;
	private int pestoque;
	private int progrpcodigo;
	
	public ProdutoBean(int pcodigo, String pdescricao, int pestoque, int progrpcodigo) {
		super();
		this.pcodigo = pcodigo;
		this.pdescricao = pdescricao;
		this.pestoque = pestoque;
		this.progrpcodigo = progrpcodigo;
	}
	public int getPcodigo() {
		return pcodigo;
	}
	public void setPcodigo(int pcodigo) {
		this.pcodigo = pcodigo;
	}
	public String getPdescricao() {
		return pdescricao;
	}
	public void setPdescricao(String pdescricao) {
		this.pdescricao = pdescricao;
	}
	public int getPestoque() {
		return pestoque;
	}
	public void setPestoque(int pestoque) {
		this.pestoque = pestoque;
	}
	public int getProgrpcodigo() {
		return progrpcodigo;
	}
	public void setProgrpcodigo(int progrpcodigo) {
		this.progrpcodigo = progrpcodigo;
	}
}
