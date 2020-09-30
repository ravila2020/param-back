package com.oneproject.satparam.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(Mpdt024Id.class)
@Table(name = "mpdt024")
public class Mpdt024 {


	@Id           
	private String  codent;                           

	@Id           
	private float  codmar;                              
                      
	@Column(name = "DESMAR", length = 30)	
	private String desmar;
	
	@Column(name = "DESMARRED", length = 10)	
	private String desmarred;

	@Column(name = "CODENTUMO", length = 4)	
	private String codentumo;

	@Column(name = "CODOFIUMO", length = 4)	
	private String codifiumo;

	@Column(name = "USUARIOUMO", length = 8)	
	private String usuarioumo;

	@Column(name = "CODTERMUMO", length = 8)	
	private String codtermumo;

	@Column(name = "CONTCUR", length = 14 )	
	private String contcur;

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
	public String getDesmar() {
		return desmar;
	}

	public void setDesmar(String desmar) {
		this.desmar = desmar;
	}
	public String getDesmarred() {
		return desmarred;
	}

	public void setDesmarred(String desmarred) {
		this.desmarred = desmarred;
	}

	public String getCodentumo() {
		return codentumo;
	}

	public void setCodentumo(String codentumo) {
		this.codentumo = codentumo;
	}

	public String getCodifiumo() {
		return codifiumo;
	}

	public void setCodifiumo(String codifiumo) {
		this.codifiumo = codifiumo;
	}

	public String getUsuarioumo() {
		return usuarioumo;
	}

	public void setUsuarioumo(String usuarioumo) {
		this.usuarioumo = usuarioumo;
	}

	public String getCodtermumo() {
		return codtermumo;
	}

	public void setCodtermumo(String codtermumo) {
		this.codtermumo = codtermumo;
	}

	public String getContcur() {
		return contcur;
	}

	public void setContcur(String contcur) {
		this.contcur = contcur;
	}

}
