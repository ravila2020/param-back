
package com.oneproject.satparam.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mpdt061")
public class Mpdt061 {
	
	@Id
	
	@Column(name ="BINPRE")
	private String Binpre;
	@Column(name ="BINPREPRO")
	private String Binprepro;
	@Column(name ="CLAMON")
	private int Clamon;
	@Column(name ="CLASE")
	private String Clase;
	@Column(name ="CODENTUMO")
	private String Codentumo;
	@Column(name ="CODOFIUMO")
	private String Codofiumo;
	@Column(name ="CODPAIS")
	private int Codpais;
	@Column(name ="CODTERMUMO")
	private String Codtermumo;
	@Column(name ="ICAENT")
	private int Icaent;
	@Column(name ="INDRANGO")
	private int Indrango;
	@Column(name ="LONGTAR")
	private String Longtar;
	@Column(name ="NOMENT")
	private String Noment;
	@Column(name ="PAISENT")
	private String Paisent;
	@Column(name ="RANGOINF")
	private String Rangoinf;
	@Column(name ="RANGOSUP")
	private String Rangosup;
	@Column(name ="SITCOMPEN")
	private int Sitcompen;
	@Column(name ="SITENT")
	private int Sitent;
	@Column(name ="USUARIOUMO")
	private String Usuarioumo;
	@Column(name ="CONTCUR")
	private String Contcur;
	public String getBinpre() {
		return Binpre;
	}
	public void setBinpre(String binpre) {
		Binpre = binpre;
	}
	public String getBinprepro() {
		return Binprepro;
	}
	public void setBinprepro(String binprepro) {
		Binprepro = binprepro;
	}
	public int getClamon() {
		return Clamon;
	}
	public void setClamon(int clamon) {
		Clamon = clamon;
	}
	public String getClase() {
		return Clase;
	}
	public void setClase(String clase) {
		Clase = clase;
	}
	public String getCodentumo() {
		return Codentumo;
	}
	public void setCodentumo(String codentumo) {
		Codentumo = codentumo;
	}
	public String getCodofiumo() {
		return Codofiumo;
	}
	public void setCodofiumo(String codofiumo) {
		Codofiumo = codofiumo;
	}
	public int getCodpais() {
		return Codpais;
	}
	public void setCodpais(int codpais) {
		Codpais = codpais;
	}
	public String getCodtermumo() {
		return Codtermumo;
	}
	public void setCodtermumo(String codtermumo) {
		Codtermumo = codtermumo;
	}
	public int getIcaent() {
		return Icaent;
	}
	public void setIcaent(int icaent) {
		Icaent = icaent;
	}
	public int getIndrango() {
		return Indrango;
	}
	public void setIndrango(int indrango) {
		Indrango = indrango;
	}
	public String getLongtar() {
		return Longtar;
	}
	public void setLongtar(String longtar) {
		Longtar = longtar;
	}
	public String getNoment() {
		return Noment;
	}
	public void setNoment(String noment) {
		Noment = noment;
	}
	public String getPaisent() {
		return Paisent;
	}
	public void setPaisent(String paisent) {
		Paisent = paisent;
	}
	public String getRangoinf() {
		return Rangoinf;
	}
	public void setRangoinf(String rangoinf) {
		Rangoinf = rangoinf;
	}
	public String getRangosup() {
		return Rangosup;
	}
	public void setRangosup(String rangosup) {
		Rangosup = rangosup;
	}
	public int getSitcompen() {
		return Sitcompen;
	}
	public void setSitcompen(int sitcompen) {
		Sitcompen = sitcompen;
	}
	public int getSitent() {
		return Sitent;
	}
	public void setSitent(int sitent) {
		Sitent = sitent;
	}
	public String getUsuarioumo() {
		return Usuarioumo;
	}
	public void setUsuarioumo(String usuarioumo) {
		Usuarioumo = usuarioumo;
	}
	public String getContcur() {
		return Contcur;
	}
	public void setContcur(String contcur) {
		Contcur = contcur;
	}
	
	

}
