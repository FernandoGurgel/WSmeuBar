package com.ifam.meubar.model.bean;

public class EstadoBean{
	
	private int ecodigo;
	private String edescricao;
	
	public EstadoBean(){
		super();
	}
	public EstadoBean(int ecodigo, String edescricao) {
		super();
		this.ecodigo = ecodigo;
		this.edescricao = edescricao;
	}
	public int getEcodigo() {
		return ecodigo;
	}
	public void setEcodigo(int ecodigo) {
		this.ecodigo = ecodigo;
	}
	public String getEdescricao() {
		return edescricao;
	}
	public void setEdescricao(String edescricao) {
		this.edescricao = edescricao;
	}
}
