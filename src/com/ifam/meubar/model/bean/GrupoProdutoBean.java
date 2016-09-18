package com.ifam.meubar.model.bean;

public class GrupoProdutoBean {

	private int gpcodigo;
	private String gpdescricao;
	
	public GrupoProdutoBean(int gpcodigo, String gpdescricao) {
		super();
		this.gpcodigo = gpcodigo;
		this.gpdescricao = gpdescricao;
	}
	public int getGpcodigo() {
		return gpcodigo;
	}
	public void setGpcodigo(int gpcodigo) {
		this.gpcodigo = gpcodigo;
	}
	public String getGpdescricao() {
		return gpdescricao;
	}
	public void setGpdescricao(String gpdescricao) {
		this.gpdescricao = gpdescricao;
	}
}
