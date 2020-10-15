package com.oneproject.satparam.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Mpdt025Id implements Serializable {

	private String codent;
	private int codmar;
	private int indtipt;

	private String binproc;                                   
	private String rangosup;                                  
	private String rangoinf;
	
	
	
	public String getCodent() {
		return codent;
	}
	public void setCodent(String codent) {
		this.codent = codent;
	}
	public int getCodmar() {
		return codmar;
	}
	public void setCodmar(int codmar) {
		this.codmar = codmar;
	}
	public int getIndtipt() {
		return indtipt;
	}
	public void setIndtipt(int indtipt) {
		this.indtipt = indtipt;
	}
	public String getBinproc() {
		return binproc;
	}
	public void setBinproc(String binproc) {
		this.binproc = binproc;
	}
	public String getRangosup() {
		return rangosup;
	}
	public void setRangosup(String rangosup) {
		this.rangosup = rangosup;
	}
	public String getRangoinf() {
		return rangoinf;
	}
	public void setRangoinf(String rangoinf) {
		this.rangoinf = rangoinf;
	}                                  
	
	

}
