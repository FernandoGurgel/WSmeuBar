package com.ifam.meubar.model.bean;

public class PedidoBean{

	private int pedcodigo;
	private String peddata;
	private String pedobs;
	private int pedmesa;
	private int pedclicodigo;
	private int pedfuncodigo;
	
	public PedidoBean(int pedcodigo, String peddata, String pedobs, int pedmesa, int pedclicodigo, int pedfuncodigo) {
		super();
		this.pedcodigo = pedcodigo;
		this.peddata = peddata;
		this.pedobs = pedobs;
		this.pedmesa = pedmesa;
		this.pedclicodigo = pedclicodigo;
		this.pedfuncodigo = pedfuncodigo;
	}
	public int getPedcodigo() {
		return pedcodigo;
	}
	public void setPedcodigo(int pedcodigo) {
		this.pedcodigo = pedcodigo;
	}
	public String getPeddata() {
		return peddata;
	}
	public void setPeddata(String peddata) {
		this.peddata = peddata;
	}
	public String getPedobs() {
		return pedobs;
	}
	public void setPedobs(String pedobs) {
		this.pedobs = pedobs;
	}
	public int getPedmesa() {
		return pedmesa;
	}
	public void setPedmesa(int pedmesa) {
		this.pedmesa = pedmesa;
	}
	public int getPedclicodigo() {
		return pedclicodigo;
	}
	public void setPedclicodigo(int pedclicodigo) {
		this.pedclicodigo = pedclicodigo;
	}
	public int getPedfuncodigo() {
		return pedfuncodigo;
	}
	public void setPedfuncodigo(int pedfuncodigo) {
		this.pedfuncodigo = pedfuncodigo;
	}
}
