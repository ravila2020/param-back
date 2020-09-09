package com.mtto.sat.modelo;


import javax.persistence.*;

@Entity
@IdClass(ParamSatId.class)
@Table(name="param_sat")


public class ParamSat {

	@Id
	@Column(name = "CODENT", length = 4)
	private String codEnt;
	@Id
	@Column(name = "CENTALTA", length = 4)
	private String centAlta;
	@Id
	@Column(name = "PRODUCTO", length = 2)
	private String producto;
	@Id
	@Column(name = "SUBPRODU", length = 4)
	private String subProdu;
	@Id
	@Column(name = "CONDPRO", length = 4)
	private String condPro;

	
	@Column(name = "CODCAM", length = 6)           
	private String codCam          ;
	
	@Column(name = "CODCONVEN", length = 4)           
	private String codConven       ;
	
	@Column(name = "CODPROMO", length = 3)           
	private String codPromo        ;
	
	@Column(name = "NUMPER", length = 10)          
	private String numPer          ;
	
	@Column(name = "NUMPER_AVAL", length = 10)          
	private String numPerAval     ;
	
	@Column(name = "INDCTAEMP", length = 1)           
	private String indCtaEmp       ;
	
	@Column(name = "INDNOMEMP", length = 3) 
	private String indNomEmp       ;
	
	@Column(name = "NOMBREEMP", length = 30)          
	private String nombreEmp       ;
	
	@Column(name = "CODREGIMEN", length = 3)          
	private String codRegimen      ;
	
	@Column(name = "FORPAGO", length = 3)          
	private String forPago         ;
	
	@Column(name = "INDSITCTA", length = 3)
	private String indSitCta       ;
	
	@Column(name = "GRUPOLIQ", length = 3)
	private String GrupoLiq        ;
	
	@Column(name = "GRUPOCUO", length = 3)
	private String GrupoCuo        ;
	
	@Column(name = "OFIVEN", length = 4)           
	private String ofiVen          ;
	
	@Column(name = "CLAMON_1", length = 3)
	private String claMon1;
	
	@Column(name = "LIMCRECTA_1     ", length = 15)   			
	private String limCreCta1     ;
	
	@Column(name = "IMPFPAGOA_1     ", length = 15)    
	private String impFPagoA1     ;
	
	@Column(name = "LIMCRECOM_1     ", length = 15)
	private String limCreCom1     ;
	
	@Column(name = "LIMCRECOMG_1    ", length = 15)
	private String limCreComG1    ;
	
	@Column(name = "CLAMON_2        ", length = 15)
	private String claMon2        ;
	
	@Column(name = "LIMCRECTA_2     ", length = 15)
	private String limCreCta2     ;
	
	@Column(name = "IMPFPAGOA_2     ", length = 15)
	private String impFPagoA2     ;
	
	@Column(name = "LIMCRECOM_2     ", length = 15)
	private String limCreCom2     ;
	
	@Column(name = "LIMCRECOMG_2    ", length = 15)
	private String limCreComG_2    ;
	
	@Column(name = "CTACARGO_1      ", length = 30)          
	private String ctaCargo1      ;
	
	@Column(name = "CLAMON_CON_1    ", length = 15)
	private String claMonCon1    ;
	
	@Column(name = "INDDOMCARCRE    ", length = 1)           
	private String indDomCarCre    ;
	
	@Column(name = "CODFORMATO      ", length = 10)          
	private String codFormato      ;
	
	@Column(name = "CTADOM_TAR1     ", length = 30)          
	private String ctaDomTar1     ;
	
	@Column(name = "MONCTA_TAR1     ", length = 3)
	private String monCtaTar1     ;
	
	@Column(name = "INDACTPAS1      ", length = 1)           
	private String indAactPas1      ;
	
	@Column(name = "CTADOM_TAR2     ", length = 30)          
	private String ctaDomTar2     ;
	
	@Column(name = "MONCTA_TAR2     ", length = 3)
	private String monCtaTar2     ;
	
	@Column(name = "INDACTPAS2      ", length = 1)           
	private String indActPas2      ;
	
	@Column(name = "NUMPER_TAR", length = 10)          
	private String numPerTar      ;
	
	@Column(name = "CALPART_TAR", length = 2)           
	private String calPartTar     ;
	
	@Column(name = "INDTIPT_TAR", length = 3)
	private String indTipTTar     ;
	
	@Column(name = "CODMAR_TAR", length = 3)
	private String codMarTar;
	
	@Column(name = "NOMBENRED_TAR", length = 26)          
	private String nombEnRedTar;
	
	@Column(name = "IDEMPLEADO_TAR", length = 20)          
	private String idEmpleadoTar;
	
	@Column(name = "PANASOC_TAR", length = 22)          
	private String panAsocTar;
	
	@Column(name = "CODBARRAS_TAR", length = 14)    
	private String codBarrasTar;
	
	@Column(name = "REFFOTO_TAR", length = 30)          
	private String refFotoTar;
	
	@Column(name = "ESTPLAS_TAR1", length = 40)          
	private String estPlasTar1;
	
	@Column(name = "ESTPLAS_TAR2", length = 40)          
	private String estPlasTar2;
	
	@Column(name = "IDENVEST_TAR", length = 1)           
	private String idEnvEstTar;
	
	@Column(name = "CENTEST_TAR", length = 4)           
	private String centEstTar;
	
	@Column(name = "INDENVPIN_TAR", length = 1)           
	private String indEnvPinTar;
	
	@Column(name = "CENTPIN_TAR", length = 4)           
	private String centPinTar;
	
	@Column(name = "CONDEST_TAR", length = 3)           
	private String condEstTar;
	
	@Column(name = "CODPROMO_TAR", length = 3)           
	private String codPromoTar;
	
	@Column(name = "CLAMON_1_TAR", length = 3)
	private String claMon1Tar;
	
	@Column(name = "LIMDIACAJ_1_TAR", length = 15)
	private String limDiaCaj1Tar ;
	
	@Column(name = "MAXDIACAJ_1_TAR", length = 8)
	private String maxDiaCaj1Tar ;
	
	@Column(name = "CLAMON_2_TAR", length = 3)
	private String claMon2Tar;
	
	@Column(name = "LIMDIACAJ_2_TAR", length = 15)
	private String limDiaCaj2Tar ;
	
	@Column(name = "MAXDIACAJ_2_TAR", length = 8)
	private String maxDiaCaj2Tar ;
	
	@Column(name = "CUENTA", length = 12)          
	private String cuenta;
	
	@Column(name = "DESCLAMON", length = 20)          
	private String desClaMon;
	
	@Column(name = "FECALTA", length = 10)          
	private String fecAlta;
	
	@Column(name = "PAN_TAR", length = 22)          
	private String panTar;
	
	@Column(name = "FECALTA_TAR", length = 10)          
	private String fecAltaTar;
	
	@Column(name = "FECCAD_TAR", length = 8)
	private String fecCadTar;
	
	@Column(name = "DESMARRED_TAR", length = 10)          
	private String desMarRedTar;
	
	@Column(name = "DESTIPTRED_TAR", length = 10)          
	private String desTipTRedTar;
	
	@Column(name = "INDSITTAR_TAR", length = 3)
	private String indSitTarTar;
	
	@Column(name = "DESSITTAR_TAR", length = 30)          
	private String desSitTarTar ;
	
	@Column(name = "FECCOBCUO", length = 8)
	private String fecCobCuo  ;
	
	@Column(name = "DESCLAMON1", length = 20)          
	private String DesClaMon1;
	
	@Column(name = "DESCLAMON2", length = 20)          
	private String DesClaMon2 ;
	
	@Column(name = "CONTCUR", length = 26)          
	private String contCur;
	
	@Column(name = "NSECFIC_CAB", length = 10)
	private String nSecFicCab;
	
	@Column(name = "TIPOCINTA_CAB", length = 2)     
	private String tipoCintaCab ;
	
	@Column(name = "NUMREGTOT_CAB", length = 12)    
	private String numRegTotCab  ;
	
	@Column(name = "EDOCINTA_CAB", length = 1)           
	private String edoCintaCab ;
	
	@Column(name = "VALIDACION_CAB", length = 1)           
	private String validacionCab  ;
	
	@Column(name = "NSECFIC_DET", length = 10)    
	private String nSecFicDet;
	
	@Column(name = "TIPOCINTA_DET", length = 2)     
	private String tipoCintaDet ;
	
	@Column(name = "INDCAMPOINFO_DET", length = 100)         
	private String indCampoInfoDet;
	
	@Column(name = "TIPOBON_C1", length = 6)           
	private String tipoBonC1;
	
	@Column(name = "RESEMIEXT", length = 12)          
	private String resEmiEext;
	
	@Column(name = "INDPERCUO", length = 1)           
	private String indPerCuo;
	
	@Column(name = "NUMMESTOT", length = 3)
	private String numMesTot;
	
	@Column(name = "NUMFACSC", length = 3)
	private String numFacSC ;
	
	@Column(name = "SEQPLASTICO", length = 8)
	private String seqPlastico ;
	
	@Column(name = "TIPOBON_T1", length = 6)           
	private String tipoBonT1;
	
	@Column(name = "INDACTLIM", length = 1)           
	private String indActLim ;
	
	@Column(name = "INDCAMLIM", length = 1)           
	private String indCamLim;
	
	@Column(name = "VISAPHONE", length = 3)
	private String visaPhone;
	
	@Column(name = "INDFOTO", length = 1)           
	private String indFoto;
	
	@Column(name = "MAXOPER", length = 8)
	private String maxOper;
	
	@Column(name = "MAXODIA", length = 8)
	private String MAXODIA;
	
	@Column(name = "INDCTA", length = 1)           
	private String indCta;
	
	@Column(name = "INDAJENA", length = 1)           
	private String indAjena;
	
	@Column(name = "INDTIPCTA", length = 2)           
	private String indTipCta;
	
	@Column(name = "CCCPRODUC", length = 2)           
	private String cCCProduc;
	
	@Column(name = "CCCSUBPRO", length = 4)           
	private String cCCSubPro;
	
	@Column(name = "NSECFIC_FIN", length = 10)    
	private String nSecFicFin     ;
	
	@Column(name = "TIPOCINTA_FIN", length = 2)
	private String tipoCintaFin ;
	
	@Column(name = "EDOCINTA_FIN", length = 1)           
	private String edoCintaFin;
	
	@Column(name = "VALIDACION_FIN", length = 1)           
	private String validacionFin;
	
	@Column(name = "LIMCRETAR", length = 15)    
	private String limCreTar;
	
	@Column(name = "LIMCREMES", length = 15)   
	private String limCreMes;
	
	@Column(name = "LIMDEBMES", length = 15)
	private String limDebMes;
	
	@Column(name = "LIMCREDIA", length = 15)
	private String limCreDia;
	
	@Column(name = "LIMDEBDIA", length = 15)
	private String limDebDia;

	public String getCodent() {
		return codEnt;
	}

	public void setCodent(String codent) {
		this.codEnt = codent;
	}

	public String getCentalta() {
		return centAlta;
	}

	public void setCentalta(String centalta) {
		this.centAlta = centalta;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getSubprodu() {
		return subProdu;
	}

	public void setSubprodu(String subprodu) {
		this.subProdu = subprodu;
	}

	public String getCondpro() {
		return condPro;
	}

	public void setCondpro(String condpro) {
		this.condPro = condpro;
	}

	public String getCodCam() {
		return codCam;
	}

	public void setCodCam(String codCam) {
		this.codCam = codCam;
	}

	public String getCodConven() {
		return codConven;
	}

	public void setCodConven(String codConven) {
		this.codConven = codConven;
	}

	public String getCodPromo() {
		return codPromo;
	}

	public void setCodPromo(String codPromo) {
		this.codPromo = codPromo;
	}

	public String getNumPer() {
		return numPer;
	}

	public void setNumPer(String numPer) {
		this.numPer = numPer;
	}

	public String getNumPerAval() {
		return numPerAval;
	}

	public void setNumPerAval(String numPerAval) {
		this.numPerAval = numPerAval;
	}

	public String getIndCtaEmp() {
		return indCtaEmp;
	}

	public void setIndCtaEmp(String indCtaEmp) {
		this.indCtaEmp = indCtaEmp;
	}

	public String getIndNomEmp() {
		return indNomEmp;
	}

	public void setIndNomEmp(String indNomEmp) {
		this.indNomEmp = indNomEmp;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

	public String getCodRegimen() {
		return codRegimen;
	}

	public void setCodRegimen(String codRegimen) {
		this.codRegimen = codRegimen;
	}

	public String getForPago() {
		return forPago;
	}

	public void setForPago(String forPago) {
		this.forPago = forPago;
	}

	public String getIndSitCta() {
		return indSitCta;
	}

	public void setIndSitCta(String indSitCta) {
		this.indSitCta = indSitCta;
	}

	public String getGrupoLiq() {
		return GrupoLiq;
	}

	public void setGrupoLiq(String grupoLiq) {
		GrupoLiq = grupoLiq;
	}

	public String getGrupoCuo() {
		return GrupoCuo;
	}

	public void setGrupoCuo(String grupoCuo) {
		GrupoCuo = grupoCuo;
	}

	public String getOfiVen() {
		return ofiVen;
	}

	public void setOfiVen(String ofiVen) {
		this.ofiVen = ofiVen;
	}

	public String getClaMon1() {
		return claMon1;
	}

	public void setClaMon1(String claMon1) {
		this.claMon1 = claMon1;
	}

	public String getLimCreCta1() {
		return limCreCta1;
	}

	public void setLimCreCta1(String limCreCta1) {
		this.limCreCta1 = limCreCta1;
	}

	public String getImpFPagoA1() {
		return impFPagoA1;
	}

	public void setImpFPagoA1(String impFPagoA1) {
		this.impFPagoA1 = impFPagoA1;
	}

	public String getLimCreCom1() {
		return limCreCom1;
	}

	public void setLimCreCom1(String limCreCom1) {
		this.limCreCom1 = limCreCom1;
	}

	public String getLimCreComG1() {
		return limCreComG1;
	}

	public void setLimCreComG1(String limCreComG1) {
		this.limCreComG1 = limCreComG1;
	}

	public String getClaMon2() {
		return claMon2;
	}

	public void setClaMon2(String claMon2) {
		this.claMon2 = claMon2;
	}

	public String getLimCreCta2() {
		return limCreCta2;
	}

	public void setLimCreCta2(String limCreCta2) {
		this.limCreCta2 = limCreCta2;
	}

	public String getImpFPagoA2() {
		return impFPagoA2;
	}

	public void setImpFPagoA2(String impFPagoA2) {
		this.impFPagoA2 = impFPagoA2;
	}

	public String getLimCreCom2() {
		return limCreCom2;
	}

	public void setLimCreCom2(String limCreCom2) {
		this.limCreCom2 = limCreCom2;
	}

	public String getLimCreComG_2() {
		return limCreComG_2;
	}

	public void setLimCreComG_2(String limCreComG_2) {
		this.limCreComG_2 = limCreComG_2;
	}

	public String getCtaCargo1() {
		return ctaCargo1;
	}

	public void setCtaCargo1(String ctaCargo1) {
		this.ctaCargo1 = ctaCargo1;
	}

	public String getClaMonCon1() {
		return claMonCon1;
	}

	public void setClaMonCon1(String claMonCon1) {
		this.claMonCon1 = claMonCon1;
	}

	public String getIndDomCarCre() {
		return indDomCarCre;
	}

	public void setIndDomCarCre(String indDomCarCre) {
		this.indDomCarCre = indDomCarCre;
	}

	public String getCodFormato() {
		return codFormato;
	}

	public void setCodFormato(String codFormato) {
		this.codFormato = codFormato;
	}

	public String getCtaDomTar1() {
		return ctaDomTar1;
	}

	public void setCtaDomTar1(String ctaDomTar1) {
		this.ctaDomTar1 = ctaDomTar1;
	}

	public String getMonCtaTar1() {
		return monCtaTar1;
	}

	public void setMonCtaTar1(String monCtaTar1) {
		this.monCtaTar1 = monCtaTar1;
	}

	public String getIndAactPas1() {
		return indAactPas1;
	}

	public void setIndAactPas1(String indAactPas1) {
		this.indAactPas1 = indAactPas1;
	}

	public String getCtaDomTar2() {
		return ctaDomTar2;
	}

	public void setCtaDomTar2(String ctaDomTar2) {
		this.ctaDomTar2 = ctaDomTar2;
	}

	public String getMonCtaTar2() {
		return monCtaTar2;
	}

	public void setMonCtaTar2(String monCtaTar2) {
		this.monCtaTar2 = monCtaTar2;
	}

	public String getIndActPas2() {
		return indActPas2;
	}

	public void setIndActPas2(String indActPas2) {
		this.indActPas2 = indActPas2;
	}

	public String getNumPerTar() {
		return numPerTar;
	}

	public void setNumPerTar(String numPerTar) {
		this.numPerTar = numPerTar;
	}

	public String getCalPartTar() {
		return calPartTar;
	}

	public void setCalPartTar(String calPartTar) {
		this.calPartTar = calPartTar;
	}

	public String getIndTipTTar() {
		return indTipTTar;
	}

	public void setIndTipTTar(String indTipTTar) {
		this.indTipTTar = indTipTTar;
	}

	public String getCodMarTar() {
		return codMarTar;
	}

	public void setCodMarTar(String codMarTar) {
		this.codMarTar = codMarTar;
	}

	public String getNombEnRedTar() {
		return nombEnRedTar;
	}

	public void setNombEnRedTar(String nombEnRedTar) {
		this.nombEnRedTar = nombEnRedTar;
	}

	public String getIdEmpleadoTar() {
		return idEmpleadoTar;
	}

	public void setIdEmpleadoTar(String idEmpleadoTar) {
		this.idEmpleadoTar = idEmpleadoTar;
	}

	public String getPanAsocTar() {
		return panAsocTar;
	}

	public void setPanAsocTar(String panAsocTar) {
		this.panAsocTar = panAsocTar;
	}

	public String getCodBarrasTar() {
		return codBarrasTar;
	}

	public void setCodBarrasTar(String codBarrasTar) {
		this.codBarrasTar = codBarrasTar;
	}

	public String getRefFotoTar() {
		return refFotoTar;
	}

	public void setRefFotoTar(String refFotoTar) {
		this.refFotoTar = refFotoTar;
	}

	public String getEstPlasTar1() {
		return estPlasTar1;
	}

	public void setEstPlasTar1(String estPlasTar1) {
		this.estPlasTar1 = estPlasTar1;
	}

	public String getEstPlasTar2() {
		return estPlasTar2;
	}

	public void setEstPlasTar2(String estPlasTar2) {
		this.estPlasTar2 = estPlasTar2;
	}

	public String getIdEnvEstTar() {
		return idEnvEstTar;
	}

	public void setIdEnvEstTar(String idEnvEstTar) {
		this.idEnvEstTar = idEnvEstTar;
	}

	public String getCentEstTar() {
		return centEstTar;
	}

	public void setCentEstTar(String centEstTar) {
		this.centEstTar = centEstTar;
	}

	public String getIndEnvPinTar() {
		return indEnvPinTar;
	}

	public void setIndEnvPinTar(String indEnvPinTar) {
		this.indEnvPinTar = indEnvPinTar;
	}

	public String getCentPinTar() {
		return centPinTar;
	}

	public void setCentPinTar(String centPinTar) {
		this.centPinTar = centPinTar;
	}

	public String getCondEstTar() {
		return condEstTar;
	}

	public void setCondEstTar(String condEstTar) {
		this.condEstTar = condEstTar;
	}

	public String getCodPromoTar() {
		return codPromoTar;
	}

	public void setCodPromoTar(String codPromoTar) {
		this.codPromoTar = codPromoTar;
	}

	public String getClaMon1Tar() {
		return claMon1Tar;
	}

	public void setClaMon1Tar(String clamon1tar) {
		claMon1Tar = clamon1tar;
	}

	public String getLimDiaCaj1Tar() {
		return limDiaCaj1Tar;
	}

	public void setLimDiaCaj1Tar(String limDiaCaj1Tar) {
		this.limDiaCaj1Tar = limDiaCaj1Tar;
	}

	public String getMaxDiaCaj1Tar() {
		return maxDiaCaj1Tar;
	}

	public void setMaxDiaCaj1Tar(String maxDiaCaj1Tar) {
		this.maxDiaCaj1Tar = maxDiaCaj1Tar;
	}

	public String getClaMon2Tar() {
		return claMon2Tar;
	}

	public void setClaMon2Tar(String claMon2Tar) {
		this.claMon2Tar = claMon2Tar;
	}

	public String getLimDiaCaj2Tar() {
		return limDiaCaj2Tar;
	}

	public void setLimDiaCaj2Tar(String limDiaCaj2Tar) {
		this.limDiaCaj2Tar = limDiaCaj2Tar;
	}

	public String getMaxDiaCaj2Tar() {
		return maxDiaCaj2Tar;
	}

	public void setMaxDiaCaj2Tar(String maxDiaCaj2Tar) {
		this.maxDiaCaj2Tar = maxDiaCaj2Tar;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDesClaMon() {
		return desClaMon;
	}

	public void setDesClaMon(String desClaMon) {
		this.desClaMon = desClaMon;
	}

	public String getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(String fecAlta) {
		this.fecAlta = fecAlta;
	}

	public String getPanTar() {
		return panTar;
	}

	public void setPanTar(String panTar) {
		this.panTar = panTar;
	}

	public String getFecAltaTar() {
		return fecAltaTar;
	}

	public void setFecAltaTar(String fecAltaTar) {
		this.fecAltaTar = fecAltaTar;
	}

	public String getFecCadTar() {
		return fecCadTar;
	}

	public void setFecCadTar(String fecCadTar) {
		this.fecCadTar = fecCadTar;
	}

	public String getDesMarRedTar() {
		return desMarRedTar;
	}

	public void setDesMarRedTar(String desMarRedTar) {
		this.desMarRedTar = desMarRedTar;
	}

	public String getDesTipTRedTar() {
		return desTipTRedTar;
	}

	public void setDesTipTRedTar(String desTipTRedTar) {
		this.desTipTRedTar = desTipTRedTar;
	}

	public String getIndSitTarTar() {
		return indSitTarTar;
	}

	public void setIndSitTarTar(String indSitTarTar) {
		this.indSitTarTar = indSitTarTar;
	}

	public String getDesSitTarTar() {
		return desSitTarTar;
	}

	public void setDesSitTarTar(String desSitTarTar) {
		this.desSitTarTar = desSitTarTar;
	}

	public String getFecCobCuo() {
		return fecCobCuo;
	}

	public void setFecCobCuo(String fecCobCuo) {
		this.fecCobCuo = fecCobCuo;
	}

	public String getDesClaMon1() {
		return DesClaMon1;
	}

	public void setDesClaMon1(String desClaMon1) {
		DesClaMon1 = desClaMon1;
	}

	public String getDesClaMon2() {
		return DesClaMon2;
	}

	public void setDesClaMon2(String desClaMon2) {
		DesClaMon2 = desClaMon2;
	}

	public String getContCur() {
		return contCur;
	}

	public void setContCur(String contCur) {
		this.contCur = contCur;
	}

	public String getnSecFicCab() {
		return nSecFicCab;
	}

	public void setnSecFicCab(String nSecFicCab) {
		this.nSecFicCab = nSecFicCab;
	}

	public String getTipoCintaCab() {
		return tipoCintaCab;
	}

	public void setTipoCintaCab(String tipoCintaCab) {
		this.tipoCintaCab = tipoCintaCab;
	}

	public String getNumRegTotCab() {
		return numRegTotCab;
	}

	public void setNumRegTotCab(String numRegTotCab) {
		this.numRegTotCab = numRegTotCab;
	}

	public String getEdoCintaCab() {
		return edoCintaCab;
	}

	public void setEdoCintaCab(String edoCintaCab) {
		this.edoCintaCab = edoCintaCab;
	}

	public String getValidacionCab() {
		return validacionCab;
	}

	public void setValidacionCab(String validacionCab) {
		this.validacionCab = validacionCab;
	}

	public String getnSecFicDet() {
		return nSecFicDet;
	}

	public void setnSecFicDet(String nSecFicDet) {
		this.nSecFicDet = nSecFicDet;
	}

	public String getTipoCintaDet() {
		return tipoCintaDet;
	}

	public void setTipoCintaDet(String tipoCintaDet) {
		this.tipoCintaDet = tipoCintaDet;
	}

	public String getIndCampoInfoDet() {
		return indCampoInfoDet;
	}

	public void setIndCampoInfoDet(String indCampoInfoDet) {
		this.indCampoInfoDet = indCampoInfoDet;
	}

	public String getTipoBonC1() {
		return tipoBonC1;
	}

	public void setTipoBonC1(String tipoBonC1) {
		this.tipoBonC1 = tipoBonC1;
	}

	public String getResEmiEext() {
		return resEmiEext;
	}

	public void setResEmiEext(String resEmiEext) {
		this.resEmiEext = resEmiEext;
	}

	public String getIndPerCuo() {
		return indPerCuo;
	}

	public void setIndPerCuo(String indPerCuo) {
		this.indPerCuo = indPerCuo;
	}

	public String getNumMesTot() {
		return numMesTot;
	}

	public void setNumMesTot(String numMesTot) {
		this.numMesTot = numMesTot;
	}

	public String getNumFacSC() {
		return numFacSC;
	}

	public void setNumFacSC(String numFacSC) {
		this.numFacSC = numFacSC;
	}

	public String getSeqPlastico() {
		return seqPlastico;
	}

	public void setSeqPlastico(String seqPlastico) {
		this.seqPlastico = seqPlastico;
	}

	public String getTipoBonT1() {
		return tipoBonT1;
	}

	public void setTipoBonT1(String tipoBonT1) {
		this.tipoBonT1 = tipoBonT1;
	}

	public String getIndActLim() {
		return indActLim;
	}

	public void setIndActLim(String indActLim) {
		this.indActLim = indActLim;
	}

	public String getIndCamLim() {
		return indCamLim;
	}

	public void setIndCamLim(String indCamLim) {
		this.indCamLim = indCamLim;
	}

	public String getVisaPhone() {
		return visaPhone;
	}

	public void setVisaPhone(String visaPhone) {
		this.visaPhone = visaPhone;
	}

	public String getIndFoto() {
		return indFoto;
	}

	public void setIndFoto(String indFoto) {
		this.indFoto = indFoto;
	}

	public String getMaxOper() {
		return maxOper;
	}

	public void setMaxOper(String maxOper) {
		this.maxOper = maxOper;
	}

	public String getMAXODIA() {
		return MAXODIA;
	}

	public void setMAXODIA(String mAXODIA) {
		MAXODIA = mAXODIA;
	}

	public String getIndCta() {
		return indCta;
	}

	public void setIndCta(String indCta) {
		this.indCta = indCta;
	}

	public String getIndAjena() {
		return indAjena;
	}

	public void setIndAjena(String indAjena) {
		this.indAjena = indAjena;
	}

	public String getIndTipCta() {
		return indTipCta;
	}

	public void setIndTipCta(String indTipCta) {
		this.indTipCta = indTipCta;
	}

	public String getcCCProduc() {
		return cCCProduc;
	}

	public void setcCCProduc(String cCCProduc) {
		this.cCCProduc = cCCProduc;
	}

	public String getcCCSubPro() {
		return cCCSubPro;
	}

	public void setcCCSubPro(String cCCSubPro) {
		this.cCCSubPro = cCCSubPro;
	}

	public String getnSecFicFin() {
		return nSecFicFin;
	}

	public void setnSecFicFin(String nSecFicFin) {
		this.nSecFicFin = nSecFicFin;
	}

	public String getTipoCintaFin() {
		return tipoCintaFin;
	}

	public void setTipoCintaFin(String tipoCintaFin) {
		this.tipoCintaFin = tipoCintaFin;
	}

	public String getEdoCintaFin() {
		return edoCintaFin;
	}

	public void setEdoCintaFin(String edoCintaFin) {
		this.edoCintaFin = edoCintaFin;
	}

	public String getValidacionFin() {
		return validacionFin;
	}

	public void setValidacionFin(String validacionFin) {
		this.validacionFin = validacionFin;
	}

	public String getLimCreTar() {
		return limCreTar;
	}

	public void setLimCreTar(String limCreTar) {
		this.limCreTar = limCreTar;
	}

	public String getLimCreMes() {
		return limCreMes;
	}

	public void setLimCreMes(String limCreMes) {
		this.limCreMes = limCreMes;
	}

	public String getLimDebMes() {
		return limDebMes;
	}

	public void setLimDebMes(String limDebMes) {
		this.limDebMes = limDebMes;
	}

	public String getLimCreDia() {
		return limCreDia;
	}

	public void setLimCreDia(String limCreDia) {
		this.limCreDia = limCreDia;
	}

	public String getLimDebDia() {
		return limDebDia;
	}

	public void setLimDebDia(String limDebDia) {
		this.limDebDia = limDebDia;
	}

	
	
	
	
}
