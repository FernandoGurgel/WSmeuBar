package com.ifam.meubar.model.bean;

public class ClienteBean {
	private int codigo;
	private String nome;
	private String telefone;
	
	public ClienteBean(){
		super();
	}
	
	public ClienteBean(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
		
	public ClienteBean(int codigo, String nome, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
