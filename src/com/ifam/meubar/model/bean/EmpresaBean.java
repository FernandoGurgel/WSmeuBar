package com.ifam.meubar.model.bean;

public class EmpresaBean{

	private int empCodigo;
	private String empNome;
	private String empCnpj;
	private String empComplemento;
	private int empLogCodigo;

	public EmpresaBean(){
		super();
	}
	public EmpresaBean(int empCodigo, String empNome, String empCnpj, String empComplemento,int logradouro) {
		super();
		this.empCodigo = empCodigo;
		this.empNome = empNome;
		this.empCnpj = empCnpj;
		this.empComplemento = empComplemento;
		this.empLogCodigo = logradouro;
	}

	public int getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(int empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getEmpNome() {
		return empNome;
	}

	public void setEmpNome(String empNome) {
		this.empNome = empNome;
	}

	public String getEmpCnpj() {
		return empCnpj;
	}

	public void setEmpCnpj(String empCnpj) {
		this.empCnpj = empCnpj;
	}
	
	public String getEmpComplemento() {
		return empComplemento;
	}
	public void setEmpComplemento(String empComplemento) {
		this.empComplemento = empComplemento;
	}
	public int getEmpLogCodigo() {
		return empLogCodigo;
	}
	public void setEmpLogCodigo(int empLogCodigo) {
		this.empLogCodigo = empLogCodigo;
	}
	
}
