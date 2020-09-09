package com.oneproject.satparam.modelo;
//xy
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import java.util.Date;

@Entity
@IdClass(Mpdt043Id.class)
@Table(name = "mpdt043")

public class Mpdt043 {

	@Id
	private String codent;
	@Id
	private String producto;
	@Id
	private String subprodu;

	@Column(name = "VERTIENTE", length = 01)
	private String vertiente;
	
	private float clamon;
	
	@Column(name = "DESPROD", length = 30)
	private String desprod;
	@Column(name = "DESPRODRED", length = 10)
	private String desprodred;

	private Date fecalta;

	@Column(name = "INDRIESGO", length = 02)
	private String indriesgo;
	
	private float limcrectamin;
	private float limcrectamax;
	private float limcrecompmin;
	private float limcrecompmax;
	
	@Column(name = "INDGARAN", length = 01)
	private String indgaran;
	@Column(name = "INDCTADOMCRE", length = 01)
	private String indctadomcre;
	@Column(name = "CLASEG", length = 03)
	private String claseg;
	@Column(name = "TIPSEG", length = 03)
	private String tipseg;

	private Date fecini;	
	private Date fecfin;
	
	@Column(name = "INDCTATIP", length = 01)
	private String indctatip;
	
	private float impexclimtol;
	
	@Column(name = "INDEXCLIM", length = 01)
	private String indexclim;
	@Column(name = "INDTRAFECCAD", length = 01)
	private String indtrafeccad;
	@Column(name = "APLICUOTA", length = 01)
	private String aplicuota;
	@Column(name = "TRASALACR", length = 01)
	private String trasalacr;
	
	private float numdiadevacr;
	@Column(name = "TRASALDIS", length = 01)
	private String trasaldis;
	
	private float indcuouso;
	private float nummesdemora;
	
	@Column(name = "INDPERCUO", length = 01)
	private String indpercuo;
	
	private float nummesmax;
	private float numdiaresol;
	
	@Column(name = "INDLIMUNI", length = 01)
	private String indlimuni;
	
	private float numdiamasact;
	
	@Column(name = "INDLIMITEU", length = 01)
	private String indlimiteu;
	
	private float porimpaga;
	private float impminmor;
	private float impminmin;
	private float portoltot;
	private float imptoltot;
	private float impmincomcuo;
	private float impmaxcomcuo;
	private float cuotamin;
	private float cuotamax;
	private float nummesmincuo;
	private float nummesmaxcuo;
	private float impmailing;
	
	@Column(name = "CODENTUMO", length = 04)
	private String codentumo;
	@Column(name = "CODOFIUMO", length = 04)
	private String codofiumo;
	@Column(name = "USUARIOUMO", length = 8)
	private String usuarioumo;
	@Column(name = "CODTERMUMO", length = 8)
	private String codtermumo;
	
	
	//private DateTime contcur; -- Este dato tiene un default en la BD
	
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
	public String getVertiente() {
		return vertiente;
	}
	public void setVertiente(String vertiente) {
		this.vertiente = vertiente;
	}
	public float getClamon() {
		return clamon;
	}
	public void setClamon(float clamon) {
		this.clamon = clamon;
	}
	public String getDesprod() {
		return desprod;
	}
	public void setDesprod(String desprod) {
		this.desprod = desprod;
	}
	public String getDesprodred() {
		return desprodred;
	}
	public void setDesprodred(String desprodred) {
		this.desprodred = desprodred;
	}
	public Date getFecalta() {
		return fecalta;
	}
	public void setFecalta(Date fecalta) {
		this.fecalta = fecalta;
	}
	public String getIndriesgo() {
		return indriesgo;
	}
	public void setIndriesgo(String indriesgo) {
		this.indriesgo = indriesgo;
	}
	public float getLimcrectamin() {
		return limcrectamin;
	}
	public void setLimcrectamin(float limcrectamin) {
		this.limcrectamin = limcrectamin;
	}
	public float getLimcrectamax() {
		return limcrectamax;
	}
	public void setLimcrectamax(float limcrectamax) {
		this.limcrectamax = limcrectamax;
	}
	public float getLimcrecompmin() {
		return limcrecompmin;
	}
	public void setLimcrecompmin(float limcrecompmin) {
		this.limcrecompmin = limcrecompmin;
	}
	public float getLimcrecompmax() {
		return limcrecompmax;
	}
	public void setLimcrecompmax(float limcrecompmax) {
		this.limcrecompmax = limcrecompmax;
	}
	public String getIndgaran() {
		return indgaran;
	}
	public void setIndgaran(String indgaran) {
		this.indgaran = indgaran;
	}
	public String getIndctadomcre() {
		return indctadomcre;
	}
	public void setIndctadomcre(String indctadomcre) {
		this.indctadomcre = indctadomcre;
	}
	public String getClaseg() {
		return claseg;
	}
	public void setClaseg(String claseg) {
		this.claseg = claseg;
	}
	public String getTipseg() {
		return tipseg;
	}
	public void setTipseg(String tipseg) {
		this.tipseg = tipseg;
	}
	public Date getFecini() {
		return fecini;
	}
	public void setFecini(Date fecini) {
		this.fecini = fecini;
	}
	public Date getFecfin() {
		return fecfin;
	}
	public void setFecfin(Date fecfin) {
		this.fecfin = fecfin;
	}
	public String getIndctatip() {
		return indctatip;
	}
	public void setIndctatip(String indctatip) {
		this.indctatip = indctatip;
	}
	public float getImpexclimtol() {
		return impexclimtol;
	}
	public void setImpexclimtol(float impexclimtol) {
		this.impexclimtol = impexclimtol;
	}
	public String getIndexclim() {
		return indexclim;
	}
	public void setIndexclim(String indexclim) {
		this.indexclim = indexclim;
	}
	public String getIndtrafeccad() {
		return indtrafeccad;
	}
	public void setIndtrafeccad(String indtrafeccad) {
		this.indtrafeccad = indtrafeccad;
	}
	public String getAplicuota() {
		return aplicuota;
	}
	public void setAplicuota(String aplicuota) {
		this.aplicuota = aplicuota;
	}
	public String getTrasalacr() {
		return trasalacr;
	}
	public void setTrasalacr(String trasalacr) {
		this.trasalacr = trasalacr;
	}
	public float getNumdiadevacr() {
		return numdiadevacr;
	}
	public void setNumdiadevacr(float numdiadevacr) {
		this.numdiadevacr = numdiadevacr;
	}
	public String getTrasaldis() {
		return trasaldis;
	}
	public void setTrasaldis(String trasaldis) {
		this.trasaldis = trasaldis;
	}
	public float getIndcuouso() {
		return indcuouso;
	}
	public void setIndcuouso(float indcuouso) {
		this.indcuouso = indcuouso;
	}
	public float getNummesdemora() {
		return nummesdemora;
	}
	public void setNummesdemora(float nummesdemora) {
		this.nummesdemora = nummesdemora;
	}
	public String getIndpercuo() {
		return indpercuo;
	}
	public void setIndpercuo(String indpercuo) {
		this.indpercuo = indpercuo;
	}
	public float getNummesmax() {
		return nummesmax;
	}
	public void setNummesmax(float nummesmax) {
		this.nummesmax = nummesmax;
	}
	public float getNumdiaresol() {
		return numdiaresol;
	}
	public void setNumdiaresol(float numdiaresol) {
		this.numdiaresol = numdiaresol;
	}
	public String getIndlimuni() {
		return indlimuni;
	}
	public void setIndlimuni(String indlimuni) {
		this.indlimuni = indlimuni;
	}
	public float getNumdiamasact() {
		return numdiamasact;
	}
	public void setNumdiamasact(float numdiamasact) {
		this.numdiamasact = numdiamasact;
	}
	public String getIndlimiteu() {
		return indlimiteu;
	}
	public void setIndlimiteu(String indlimiteu) {
		this.indlimiteu = indlimiteu;
	}
	public float getPorimpaga() {
		return porimpaga;
	}
	public void setPorimpaga(float porimpaga) {
		this.porimpaga = porimpaga;
	}
	public float getImpminmor() {
		return impminmor;
	}
	public void setImpminmor(float impminmor) {
		this.impminmor = impminmor;
	}
	public float getImpminmin() {
		return impminmin;
	}
	public void setImpminmin(float impminmin) {
		this.impminmin = impminmin;
	}
	public float getPortoltot() {
		return portoltot;
	}
	public void setPortoltot(float portoltot) {
		this.portoltot = portoltot;
	}
	public float getImptoltot() {
		return imptoltot;
	}
	public void setImptoltot(float imptoltot) {
		this.imptoltot = imptoltot;
	}
	public float getImpmincomcuo() {
		return impmincomcuo;
	}
	public void setImpmincomcuo(float impmincomcuo) {
		this.impmincomcuo = impmincomcuo;
	}
	public float getImpmaxcomcuo() {
		return impmaxcomcuo;
	}
	public void setImpmaxcomcuo(float impmaxcomcuo) {
		this.impmaxcomcuo = impmaxcomcuo;
	}
	public float getCuotamin() {
		return cuotamin;
	}
	public void setCuotamin(float cuotamin) {
		this.cuotamin = cuotamin;
	}
	public float getCuotamax() {
		return cuotamax;
	}
	public void setCuotamax(float cuotamax) {
		this.cuotamax = cuotamax;
	}
	public float getNummesmincuo() {
		return nummesmincuo;
	}
	public void setNummesmincuo(float nummesmincuo) {
		this.nummesmincuo = nummesmincuo;
	}
	public float getNummesmaxcuo() {
		return nummesmaxcuo;
	}
	public void setNummesmaxcuo(float nummesmaxcuo) {
		this.nummesmaxcuo = nummesmaxcuo;
	}
	public float getImpmailing() {
		return impmailing;
	}
	public void setImpmailing(float impmailing) {
		this.impmailing = impmailing;
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
	
	
}
