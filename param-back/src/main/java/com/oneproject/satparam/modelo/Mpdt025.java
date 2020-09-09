package com.oneproject.satparam.modelo;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.IdClass;
	import javax.persistence.Table;

	@Entity
	@IdClass(Mpdt025Id.class)
	@Table(name = "mpdt025")
	
	
	public class Mpdt025 {
	
		
	@Id           
	private String  codent;         
	
	@Column(name = "CODMAR", length = 2)	                    
	private int codmar;                                   
	                                                          
	@Column(name = "INDTIPT", length = 2)	                  
	private int indtipt;                                  
	                                                          
	@Column(name = "BINENTTIP", length = 6)	                
	private String binenttip;                                 
	                                                          
	@Column(name = "BINPROC", length = 6)	                  
	private String binproc;                                   
	                                                          
	@Column(name = "NUMULTTAR", length = 16)	                
	private long numulttar;                                
	                                                          
	@Column(name = "INDDEBCRE", length = 1)	                
	private int inddebcre;                                
	                                                          
	@Column(name = "INDBINEMP", length = 01)	                
	private String indbinemp;                                 
	                                                          
	@Column(name = "RANGOSUP", length = 16)	                  
	private String rangosup;                                  
	                                                          
	@Column(name = "RANGOINF", length = 16)	                  
	private String rangoinf;                                  
	                                                          
	@Column(name = "RUTINAPAN", length = 8)	                
	private String rutinapan;                                 
	                                                          
	@Column(name = "CODSERV", length = 3)	                  
	private int codserv;                                  
	                                                          
	@Column(name = "GENCARPIN", length = 1)	                
	private String GENCARPIN;                                 
	                                                          
	@Column(name = "INDINTPAN", length = 50)	                
	private String indintpan;                                 
	                                                          
	@Column(name = "INDCMBPAN", length = 50)	                
	private String indcmbpan;                                 
	                                                          
	@Column(name = "INDCMBPIN", length = 50)	                
	private String indcmbpin;                                 
	                                                          
	@Column(name = "NUMMESPROREN", length = 1)	              
	private int nummesproren;                             
	                                                          
	@Column(name = "NUMMINTAR", length = 4)	                
	private int nummintar;                                
	                                                          
	@Column(name = "NUMMAXDIA", length = 2)	                
	private int nummaxdia;                                
	                                                          
	@Column(name = "TECNOLOGIA", length = 10)	                
	private String tecnologia;                                
	                                                          
	@Column(name = "INDGENVISAPHONE", length = 01)	          
	private String indgenvisaphone;                           
	                                                          
	@Column(name = "INDACTTAR", length = 1)	                
	private int indacttar;                                
	                                                          
	@Column(name = "FECALTA", length = 10)	                  
	private String fecalta;                                   
	                                                          
	@Column(name = "FECINI", length = 10)	                    
	private String fecini;                                    
	                                                          
	@Column(name = "FECFIN", length = 10)	                    
	private String fecfin;                                    
	                                                          
	@Column(name = "GRUAFIN", length = 4)	                  
	private String gruafin;                                   
	                                                          
	@Column(name = "PORCESAFIN", length = 11)	                
	private int porcesafin;                               
	                                                          
	@Column(name = "PORBONTITAFIN", length = 11)	            
	private int porbontitafin;                            
	                                                          
	@Column(name = "INDADMPRES", length = 2)	                
	private String indadmpres;                                
	                                                          
	@Column(name = "INDPINPRES", length = 01)	                
	private String indpinpres;                                
	                                                          
	@Column(name = "VIGTARPRE", length = 2)	                
	private int vigtarpre;                                
	                                                          
	@Column(name = "INDMESVIGMIN", length = 2)	              
	private int indmesvigmin;                             
	                                                          
	@Column(name = "CODCLAVE", length = 3)	                  
	private String codclave;                                  
	                                                          
	@Column(name = "INDRESCLI", length = 1)	                
	private String indrescli;                                 
	                                                          
	@Column(name = "FECEXPMON", length = 10)	                
	private String fecexpmon;                                 
	                                                          
	@Column(name = "EXPONENTE", length = 1)	                
	private int exponente;                                
	                                                          
	@Column(name = "NUMKPIN", length = 2)	                  
	private int numkpin;                                  
	                                                          
	@Column(name = "PISTA1", length = 76)	                    
	private String pista1;                                    
	                                                          
	@Column(name = "PISTA2", length = 76)	                    
	private String pista2;                                    
	                                                          
	@Column(name = "TAMCODBARR", length = 9)	                
	private int tamcodbarr;                               
	                                                          
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

	public String getBinenttip() {
		return binenttip;
	}

	public void setBinenttip(String binenttip) {
		this.binenttip = binenttip;
	}

	public String getBinproc() {
		return binproc;
	}

	public void setBinproc(String binproc) {
		this.binproc = binproc;
	}

	

	

	public long getNumulttar() {
		return numulttar;
	}

	public void setNumulttar(long numulttar) {
		this.numulttar = numulttar;
	}

	public int getInddebcre() {
		return inddebcre;
	}

	public void setInddebcre(int inddebcre) {
		this.inddebcre = inddebcre;
	}

	public String getIndbinemp() {
		return indbinemp;
	}

	public void setIndbinemp(String indbinemp) {
		this.indbinemp = indbinemp;
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

	public String getRutinapan() {
		return rutinapan;
	}

	public void setRutinapan(String rutinapan) {
		this.rutinapan = rutinapan;
	}

	public int getCodserv() {
		return codserv;
	}

	public void setCodserv(int codserv) {
		this.codserv = codserv;
	}

	public String getGENCARPIN() {
		return GENCARPIN;
	}

	public void setGENCARPIN(String gENCARPIN) {
		GENCARPIN = gENCARPIN;
	}

	public String getIndintpan() {
		return indintpan;
	}

	public void setIndintpan(String indintpan) {
		this.indintpan = indintpan;
	}

	public String getIndcmbpan() {
		return indcmbpan;
	}

	public void setIndcmbpan(String indcmbpan) {
		this.indcmbpan = indcmbpan;
	}

	public String getIndcmbpin() {
		return indcmbpin;
	}

	public void setIndcmbpin(String indcmbpin) {
		this.indcmbpin = indcmbpin;
	}

	public int getNummesproren() {
		return nummesproren;
	}

	public void setNummesproren(int nummesproren) {
		this.nummesproren = nummesproren;
	}

	public int getNummintar() {
		return nummintar;
	}

	public void setNummintar(int nummintar) {
		this.nummintar = nummintar;
	}

	public int getNummaxdia() {
		return nummaxdia;
	}

	public void setNummaxdia(int nummaxdia) {
		this.nummaxdia = nummaxdia;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getIndgenvisaphone() {
		return indgenvisaphone;
	}

	public void setIndgenvisaphone(String indgenvisaphone) {
		this.indgenvisaphone = indgenvisaphone;
	}

	public int getIndacttar() {
		return indacttar;
	}

	public void setIndacttar(int indacttar) {
		this.indacttar = indacttar;
	}

	public String getFecalta() {
		return fecalta;
	}

	public void setFecalta(String fecalta) {
		this.fecalta = fecalta;
	}

	public String getFecini() {
		return fecini;
	}

	public void setFecini(String fecini) {
		this.fecini = fecini;
	}

	public String getFecfin() {
		return fecfin;
	}

	public void setFecfin(String fecfin) {
		this.fecfin = fecfin;
	}

	public String getGruafin() {
		return gruafin;
	}

	public void setGruafin(String gruafin) {
		this.gruafin = gruafin;
	}

	public int getPorcesafin() {
		return porcesafin;
	}

	public void setPorcesafin(int porcesafin) {
		this.porcesafin = porcesafin;
	}

	public int getPorbontitafin() {
		return porbontitafin;
	}

	public void setPorbontitafin(int porbontitafin) {
		this.porbontitafin = porbontitafin;
	}

	public String getIndadmpres() {
		return indadmpres;
	}

	public void setIndadmpres(String indadmpres) {
		this.indadmpres = indadmpres;
	}

	public String getIndpinpres() {
		return indpinpres;
	}

	public void setIndpinpres(String indpinpres) {
		this.indpinpres = indpinpres;
	}

	public int getVigtarpre() {
		return vigtarpre;
	}

	public void setVigtarpre(int vigtarpre) {
		this.vigtarpre = vigtarpre;
	}

	public int getIndmesvigmin() {
		return indmesvigmin;
	}

	public void setIndmesvigmin(int indmesvigmin) {
		this.indmesvigmin = indmesvigmin;
	}

	public String getCodclave() {
		return codclave;
	}

	public void setCodclave(String codclave) {
		this.codclave = codclave;
	}

	public String getIndrescli() {
		return indrescli;
	}

	public void setIndrescli(String indrescli) {
		this.indrescli = indrescli;
	}

	public String getFecexpmon() {
		return fecexpmon;
	}

	public void setFecexpmon(String fecexpmon) {
		this.fecexpmon = fecexpmon;
	}

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int exponente) {
		this.exponente = exponente;
	}

	public int getNumkpin() {
		return numkpin;
	}

	public void setNumkpin(int numkpin) {
		this.numkpin = numkpin;
	}

	public String getPista1() {
		return pista1;
	}

	public void setPista1(String pista1) {
		this.pista1 = pista1;
	}

	public String getPista2() {
		return pista2;
	}

	public void setPista2(String pista2) {
		this.pista2 = pista2;
	}

	public int getTamcodbarr() {
		return tamcodbarr;
	}

	public void setTamcodbarr(int tamcodbarr) {
		this.tamcodbarr = tamcodbarr;
	}

	public String getForestamp() {
		return forestamp;
	}

	public void setForestamp(String forestamp) {
		this.forestamp = forestamp;
	}

	public String getIndtarvir() {
		return indtarvir;
	}

	public void setIndtarvir(String indtarvir) {
		this.indtarvir = indtarvir;
	}

	public String getIndoffpvv() {
		return indoffpvv;
	}

	public void setIndoffpvv(String indoffpvv) {
		this.indoffpvv = indoffpvv;
	}

	public String getCodentumo() {
		return codentumo;
	}

	public void setCodentumo(String codentumo) {
		this.codentumo = codentumo;
	}

	public String getCodofiumo() {
		return codofiumo;
	}

	public void setCodofiumo(String codofiumo) {
		this.codofiumo = codofiumo;
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

	@Column(name = "FORESTAMP", length = 10)	                
	private String forestamp;                                 
	                                                          
	@Column(name = "INDTARVIR", length = 01)	                
	private String indtarvir;                                 
	                                                          
	@Column(name = "INDOFFPVV", length = 01)	                
	private String indoffpvv;                                 
	                                                          
	@Column(name = "CODENTUMO", length = 04)	                
	private String codentumo;                                 
	                                                          
	@Column(name = "CODOFIUMO", length = 04)	                
	private String codofiumo;                                 
	                                                          
	@Column(name = "USUARIOUMO", length = 8)	                
	private String usuarioumo;                                
	                                                          
	@Column(name = "CODTERMUMO", length = 8)	                
	private String codtermumo;                                
	                                                          
	@Column(name = "CONTCUR", length = 30)                    
	private String contcur;                                   
	                                                          

	
		
	
	
	
	
}
