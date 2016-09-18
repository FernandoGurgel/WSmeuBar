package com.ifam.meubar.model.bean;

public class CidadeBean{

	private int cidCodigo;
	private String ciddescricao;
	private int cidestcodigo;
	
	public CidadeBean(int codigo, String descricao,int estado) {
		super();
		this.cidCodigo = codigo;
		this.ciddescricao = descricao;
		this.cidestcodigo = estado;
	}

	public int getCidCodigo() {
		return cidCodigo;
	}

	public void setCidCodigo(int cidCodigo) {
		this.cidCodigo = cidCodigo;
	}

	public String getCiddescricao() {
		return ciddescricao;
	}

	public void setCiddescricao(String ciddescricao) {
		this.ciddescricao = ciddescricao;
	}

	public int getCidestcodigo() {
		return cidestcodigo;
	}

	public void setCidestcodigo(int cidestcodigo) {
		this.cidestcodigo = cidestcodigo;
	}	
}
