package com.ifam.meubar.model.bean;

public class FuncionarioBean{

	private int funcoddigo;
	private String funnome;
	private String funtefone;
	private String funemail;
	private String funcomplemento;
	private int funempcodigo;
	
	public FuncionarioBean(int funcoddigo, String funnome, String funtefone, String funemail, String funcomplemento,
			int funempcodigo) {
		super();
		this.funcoddigo = funcoddigo;
		this.funnome = funnome;
		this.funtefone = funtefone;
		this.funemail = funemail;
		this.funcomplemento = funcomplemento;
		this.funempcodigo = funempcodigo;
	}
	
	public int getFuncoddigo() {
		return funcoddigo;
	}
	public void setFuncoddigo(int funcoddigo) {
		this.funcoddigo = funcoddigo;
	}
	public String getFunnome() {
		return funnome;
	}
	public void setFunnome(String funnome) {
		this.funnome = funnome;
	}
	public String getFuntefone() {
		return funtefone;
	}
	public void setFuntefone(String funtefone) {
		this.funtefone = funtefone;
	}
	public String getFunemail() {
		return funemail;
	}
	public void setFunemail(String funemail) {
		this.funemail = funemail;
	}
	public String getFuncomplemento() {
		return funcomplemento;
	}
	public void setFuncomplemento(String funcomplemento) {
		this.funcomplemento = funcomplemento;
	}
	public int getFunempcodigo() {
		return funempcodigo;
	}
	public void setFunempcodigo(int funempcodigo) {
		this.funempcodigo = funempcodigo;
	}
}
