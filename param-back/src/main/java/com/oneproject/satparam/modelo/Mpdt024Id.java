package com.mtto.sat24.modelo;

import java.io.Serializable;

public class Mpdt024Id implements Serializable {

	private String  codent;
	private float codmar;
	

	public Mpdt024Id() {
		this.codent  = codent;
		this.codmar  = codmar;
			
	}
	
	public Mpdt024Id (String codent, float codmar) {
		this.codent = codent;
		this.codmar = codmar;

	}

	public String getCodent() {
		return codent;
	}

	public void setCodent(String codent) {
		this.codent = codent;
	}

	public float getCodmar() {
		return codmar;
	}

	public void setCodmar(float codmar) {
		this.codmar = codmar;
	}


}
