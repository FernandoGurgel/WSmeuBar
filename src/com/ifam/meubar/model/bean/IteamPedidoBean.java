package com.ifam.meubar.model.bean;

public class IteamPedidoBean {

	private int itpQtd;
	private double itpValor;
	private int itvPedCodigo;
	private int itvProCodigo;
	
	public IteamPedidoBean(int itpQtd, double itpValor, int itvPedCodigo, int itvProCodigo) {
		super();
		this.itpQtd = itpQtd;
		this.itpValor = itpValor;
		this.itvPedCodigo = itvPedCodigo;
		this.itvProCodigo = itvProCodigo;
	}
	public int getItpQtd() {
		return itpQtd;
	}
	public void setItpQtd(int itpQtd) {
		this.itpQtd = itpQtd;
	}
	public double getItpValor() {
		return itpValor;
	}
	public void setItpValor(double itpValor) {
		this.itpValor = itpValor;
	}
	public int getItvPedCodigo() {
		return itvPedCodigo;
	}
	public void setItvPedCodigo(int itvPedCodigo) {
		this.itvPedCodigo = itvPedCodigo;
	}
	public int getItvProCodigo() {
		return itvProCodigo;
	}
	public void setItvProCodigo(int itvProCodigo) {
		this.itvProCodigo = itvProCodigo;
	}
}
