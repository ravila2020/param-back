package com.oneproject.satparam.modelo;

import java.io.Serializable;

public class ProductoSatId implements Serializable {
	private String codNrbeEnt; 
	private String idPrdSat; 
	private String idSPrdSat; 
	private String codLinea;
	
	public ProductoSatId () {
		
	}
	
	public ProductoSatId (String _codNrbeEnt, String _idPrdSat, String _idSPrdSat, String _codLinea  ) {
		this.codNrbeEnt = _codNrbeEnt;
		this.idPrdSat = _idPrdSat;
		this.idSPrdSat = _idSPrdSat;
		this.codLinea = _codLinea;
	}

	public String getCodNrbeEnt() {
		return codNrbeEnt;
	}

	public void setCodNrbeEnt(String codNrbeEnt) {
		this.codNrbeEnt = codNrbeEnt;
	}

	public String getIdPrdSat() {
		return idPrdSat;
	}

	public void setIdPrdSat(String idPrdSat) {
		this.idPrdSat = idPrdSat;
	}

	public String getIdSPrdSat() {
		return idSPrdSat;
	}

	public void setIdSPrdSat(String idSPrdSat) {
		this.idSPrdSat = idSPrdSat;
	}

	public String getCodLinea() {
		return codLinea;
	}

	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
	}
	
	
	
	
}
