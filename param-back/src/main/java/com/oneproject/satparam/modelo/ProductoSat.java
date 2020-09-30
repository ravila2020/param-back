package com.oneproject.satparam.modelo;

import javax.persistence.*;

@Entity
@IdClass(ProductoSatId.class)
@Table(name="mp_prspr_sattcb_bt")

public class ProductoSat {

	@Id
	@Column(name = "COD_NRBE_EN", length = 4)
	private String codNrbeEnt;
	
	@Id
	@Column(name="ID_PRD_SAT", length = 2)
	private String idPrdSat;
	
	@Id
	@Column(name="ID_SPRD_SAT", length = 4)
	private String idSPrdSat;
	
	@Id
	@Column(name="COD_LINEA", length = 2)
	private String codLinea;
	
	@Column(name="ID_GRP_PD", length = 2)
	private String idGrpPd;
	
	@Column(name="ID_PDV", length = 4)
	private String idPdv;
	
	@Column(name="ID_TRFA_PDV", length = 3)
	private String idTrfaPdv;
	
	@Column(name="COD_LINEA_MP", length = 2)
	private String codLineaMP;
	
	@Column(name="ID_GRP_PD_MP", length = 2)
	private String idGrpPdMP;
	
	@Column(name="ID_PDV_MP", length = 4)
	private String idPdvMP;
	
	@Column(name="ID_TRFA_PDV_MP", length = 3)
	private String idTrfaPdvMP;
	
	
	/* Getters and Setters */

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

	public String getIdGrpPd() {
		return idGrpPd;
	}

	public void setIdGrpPd(String idGpoPd) {
		this.idGrpPd = idGpoPd;
	}

	public String getIdPdv() {
		return idPdv;
	}

	public void setIdPdv(String idPdv) {
		this.idPdv = idPdv;
	}

	public String getIdTrfaPdv() {
		return idTrfaPdv;
	}

	public void setIdTrfaPdv(String idTrfaPdv) {
		this.idTrfaPdv = idTrfaPdv;
	}

	public String getCodLineaMP() {
		return codLineaMP;
	}

	public void setCodLineaMP(String codLineaMP) {
		this.codLineaMP = codLineaMP;
	}

	public String getIdGrpPdMP() {
		return idGrpPdMP;
	}

	public void setIdGrpPdMP(String idGrpPdMP) {
		this.idGrpPdMP = idGrpPdMP;
	}

	public String getIdPdvMP() {
		return idPdvMP;
	}

	public void setIdPdvMP(String idPdvMP) {
		this.idPdvMP = idPdvMP;
	}

	public String getIdTrfaPdvMP() {
		return idTrfaPdvMP;
	}

	public void setIdTrfaPdvMP(String idTrfaPdvMP) {
		this.idTrfaPdvMP = idTrfaPdvMP;
	}
	
	
}
