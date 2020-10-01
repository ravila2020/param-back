package com.oneproject.satparam.modelo;

import java.io.Serializable;

public class ProductoSatId implements Serializable {
	private String codNrbeEn;
	private String idPrdSat; 
	private String idSPrdSat; 
	private String codLinea;
	
	public ProductoSatId () {
		
	}
	
	public ProductoSatId (String _codNrbeEn, String _idPrdSat, String _idSPrdSat, String _codLinea  ) {
		this.codNrbeEn = _codNrbeEn;
		this.idPrdSat = _idPrdSat;
		this.idSPrdSat = _idSPrdSat;
		this.codLinea = _codLinea;
	}

	public String getCodNrbeEn() {
		return codNrbeEn;
	}

	public void setCodNrbeEn(String codNrbeEnt) {
		this.codNrbeEn = codNrbeEnt;
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
