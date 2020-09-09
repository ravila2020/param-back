package com.mtto.sat.modelo;

import java.io.Serializable;

public class ParamSatId implements Serializable {
	/**
	 *  GIT
	 */
	private static final long serialVersionUID = 1L;
	private String codEnt;
	private String centAlta;
	private String producto;
	private String subProdu;
	private String condPro;

	public ParamSatId() {
		/*this.codEnt = codEnt;
		this.centAlta = centAlta;
		this.producto = producto;
		this.subProdu = subProdu;
		this.condPro = condPro;
		*/
		System.out.println("Constructor de Id ParamSat");
	}
	
	public ParamSatId(String codent, String centalta, String producto, String subprodu, String condpro) {
		this.codEnt = codent;
		this.centAlta = centalta;
		this.producto = producto;
		this.subProdu = subprodu;
		this.condPro = condpro;
		
	}


	public String getCodEnt() {
		return codEnt;
	}


	public void setCodEnt(String codEnt) {
		this.codEnt = codEnt;
	}


	public String getCentAlta() {
		return centAlta;
	}


	public void setCentAlta(String centAlta) {
		this.centAlta = centAlta;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getSubProdu() {
		return subProdu;
	}


	public void setSubProdu(String subProdu) {
		this.subProdu = subProdu;
	}


	public String getCondPro() {
		return condPro;
	}


	public void setCondPro(String condPro) {
		this.condPro = condPro;
	}
	
	
}
