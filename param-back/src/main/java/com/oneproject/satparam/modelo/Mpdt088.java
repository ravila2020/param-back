package com.mtto.practicaA.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;



@Entity
@IdClass(Mpdt088Id.class)
@Table(name = "mpdt088")
public class Mpdt088 {
	
	@Id          
    private String  codent;                           

	@Id          
    private String  producto;                                          

    @Id         
    private String  subprodu;  
    
    @Column(name = "CODMAR", columnDefinition="decimal(2,0)")
    private String codmar;
    
    @Column(name = "INDTIPT", columnDefinition="decimal(2,0)")
    private String indtipt;
    
    @Column(name = "FECALTA", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private String fecalta;
    
    @Column(name = "FECBAJA", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private String fecbaja;
    
    @Column(name = "LIMCREMES", columnDefinition="decimal(17,2)")
    private String limcremes;
    
    @Column(name = "LIMDEBMES", columnDefinition="decimal(17,2)")
    private String limdebmes;
    
    @Column(name = "MAXOPER", columnDefinition="decimal(6,0)")
    private String maxoper;
    
    @Column(name = "LIMCREDIA", columnDefinition="decimal(17,2)")
    private String limcredia;
    
    @Column(name = "LIMDEBDIA", columnDefinition="decimal(17,2)")
    private String limdebdia;
    
    @Column(name = "LIMDIACAJ", columnDefinition="decimal(17,2)")
    private String limdiacaj;
    
    @Column(name = "MAXOPECAJ", columnDefinition="decimal(3,0)")
    private String maxopecaj;
    
    @Column(name = "MAXODIA", columnDefinition="decimal(3,0)")
    private String maxodia;
    
    @Column(name = "SALMAXMON", columnDefinition="decimal(17,2)")
    private String salmaxmon;
    
    @Column(name = "CARGAMAX", columnDefinition="decimal(17,2)")
    private String cargamax;
    
    @Column(name = "CONSUMAX", columnDefinition="decimal(17,2)")
    private String consumax;
    
    @Column(name = "INDACPALT", columnDefinition="char(1)",length=1)
    private String indacpalt;
    
    @Column(name = "INDACPREN", columnDefinition="char(1)",length=1)
    private String indacpren;
    
    @Column(name = "VIGTAR", columnDefinition="decimal(2,0)")
    private String vigtar;
    
    @Column(name = "VIGTARREN", columnDefinition="decimal(2,0)")
    private String vigtarren;
    
    @Column(name = "CODENTUMO", columnDefinition="char(4)",length=4)
    private String codentumo;
    
    @Column(name = "CODOFIUMO", columnDefinition="char(4)",length=4)
    private String codofiumo;
    
    @Column(name = "USUARIOUMO", columnDefinition="char(8)",length=8)
    private String usuarioumo;
    
    @Column(name = "CODTERMUMO", columnDefinition="char(8)",length=8)
    private String codtermumo;
    
    @Column(name = "CONTCUR", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String contcur;

	public String getCodent() {
		return codent;
	}

	public void setCodent(String codent) {
		this.codent = codent;
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

	public String getCodmar() {
		return codmar;
	}

	public void setCodmar(String codmar) {
		this.codmar = codmar;
	}

	public String getIndtipt() {
		return indtipt;
	}

	public void setIndtipt(String indtipt) {
		this.indtipt = indtipt;
	}

	public String getFecalta() {
		return fecalta;
	}

	public void setFecalta(String fecalta) {
		this.fecalta = fecalta;
	}

	public String getFecbaja() {
		return fecbaja;
	}

	public void setFecbaja(String fecbaja) {
		this.fecbaja = fecbaja;
	}

	public String getLimcremes() {
		return limcremes;
	}

	public void setLimcremes(String limcremes) {
		this.limcremes = limcremes;
	}

	public String getLimdebmes() {
		return limdebmes;
	}

	public void setLimdebmes(String limdebmes) {
		this.limdebmes = limdebmes;
	}

	public String getMaxoper() {
		return maxoper;
	}

	public void setMaxoper(String maxoper) {
		this.maxoper = maxoper;
	}

	public String getLimcredia() {
		return limcredia;
	}

	public void setLimcredia(String limcredia) {
		this.limcredia = limcredia;
	}

	public String getLimdebdia() {
		return limdebdia;
	}

	public void setLimdebdia(String limdebdia) {
		this.limdebdia = limdebdia;
	}

	public String getLimdiacaj() {
		return limdiacaj;
	}

	public void setLimdiacaj(String limdiacaj) {
		this.limdiacaj = limdiacaj;
	}

	public String getMaxopecaj() {
		return maxopecaj;
	}

	public void setMaxopecaj(String maxopecaj) {
		this.maxopecaj = maxopecaj;
	}

	public String getMaxodia() {
		return maxodia;
	}

	public void setMaxodia(String maxodia) {
		this.maxodia = maxodia;
	}

	public String getSalmaxmon() {
		return salmaxmon;
	}

	public void setSalmaxmon(String salmaxmon) {
		this.salmaxmon = salmaxmon;
	}

	public String getCargamax() {
		return cargamax;
	}

	public void setCargamax(String cargamax) {
		this.cargamax = cargamax;
	}

	public String getConsumax() {
		return consumax;
	}

	public void setConsumax(String consumax) {
		this.consumax = consumax;
	}

	public String getIndacpalt() {
		return indacpalt;
	}

	public void setIndacpalt(String indacpalt) {
		this.indacpalt = indacpalt;
	}

	public String getIndacpren() {
		return indacpren;
	}

	public void setIndacpren(String indacpren) {
		this.indacpren = indacpren;
	}

	public String getVigtar() {
		return vigtar;
	}

	public void setVigtar(String vigtar) {
		this.vigtar = vigtar;
	}

	public String getVigtarren() {
		return vigtarren;
	}

	public void setVigtarren(String vigtarren) {
		this.vigtarren = vigtarren;
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
    
    

}
