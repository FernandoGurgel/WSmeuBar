package com.ifam.meubar.model.bean;

public class BairroBean{

	private int baicodigo;
	private String baidescricao;
	private int baicidcodigo;
	
	public BairroBean(int codigo, String descricao,int empresa) {
		this.baicodigo = codigo;
		this.baidescricao = descricao;
		this.baicidcodigo = empresa;
	}
	public int getBaicodigo() {
		return baicodigo;
	}
	public void setBaicodigo(int baicodigo) {
		this.baicodigo = baicodigo;
	}
	public String getBaidescricao() {
		return baidescricao;
	}
	public void setBaidescricao(String baidescricao) {
		this.baidescricao = baidescricao;
	}
	public int getBaicidcodigo() {
		return baicidcodigo;
	}
	public void setBaicidcodigo(int baicidcodigo) {
		this.baicidcodigo = baicidcodigo;
	}		
}
