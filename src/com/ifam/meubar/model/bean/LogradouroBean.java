package com.ifam.meubar.model.bean;

public class LogradouroBean{

	private int logCodigo;
	private String logDescricao;
	private int logbaicodigo;
	
	public LogradouroBean(int codigo,String descricao,int bairro) {
		this.logCodigo = codigo;
		this.logDescricao = descricao;
		this.logbaicodigo = bairro;
	}

	public int getLogCodigo() {
		return logCodigo;
	}

	public void setLogCodigo(int logCodigo) {
		this.logCodigo = logCodigo;
	}

	public String getLogDescricao() {
		return logDescricao;
	}

	public void setLogDescricao(String logDescricao) {
		this.logDescricao = logDescricao;
	}

	public int getLogbaicodigo() {
		return logbaicodigo;
	}

	public void setLogbaicodigo(int logbaicodigo) {
		this.logbaicodigo = logbaicodigo;
	}
	
}
