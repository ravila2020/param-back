package com.oneproject.satparam.modelo;

import java.io.Serializable;

public class Mpdt026Id implements Serializable{
	
	private String codent;
	private String codmar;
	
	public Mpdt026Id () {
		this.codent=codent;
		this.codmar=codmar;
	}

	public String getCodent() {
		return codent;
	}

	public void setCodent(String codent) {
		this.codent = codent;
	}

	public String getCodmar() {
		return codmar;
	}

	public void setCodmar(String codmar) {
		this.codmar = codmar;
	}
	
	

}
