package com.oneproject.satparam.modelo;

import java.io.Serializable;

public class MpParamSatId implements Serializable {

	private String  codent;
	private String  centalta;
	private String  producto;
	private String  subprodu;
	private String  condpro;
	
	
	public MpParamSatId() {
		this.codent   = codent;
		this.centalta = centalta;
		this.producto = producto;	
		this.subprodu = subprodu;
		this.condpro  = condpro;
	}


	public String getCodent() {
		return codent;
	}


	public void setCodent(String codent) {
		this.codent = codent;
	}


	public String getCentalta() {
		return centalta;
	}


	public void setCentalta(String centalta) {
		this.centalta = centalta;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getSubprodu() {
		return subprodu;
	}


	public void setSubprodu(String subprodu) {
		this.subprodu = subprodu;
	}


	public String getCondpro() {
		return condpro;
	}


	public void setCondpro(String condpro) {
		this.condpro = condpro;
	}
	
}
