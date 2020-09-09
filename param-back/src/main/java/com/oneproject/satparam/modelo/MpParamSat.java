package com.oneproject.satparam.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;






@Entity
@IdClass(MpParamSatId.class)
@Table(name = "mp_param_sat")


public class MpParamSat {

	  @Id                                                  
	  private String  codent;                              
	  	                                                   
	  @Id                                                  
	  private String  centalta;                            
	  	                                                   
	  @Id                                                  
	  private String  producto;                            
	  	                                                   
	  @Id                                                  
	  private String  subprodu;                            
	  	                                                   
	  @Id                                                  
	  private String  condpro;   				                   
	  	                                                   
	@Column(name = "CODCAM", length = 06)	       	         
	private String codcam;                                 
	                                                       
	@Column(name = "CODCONVEN", length = 04)	       		   
	private String codconven;                              
	                                                       
	@Column(name = "CODPROMO", length = 03)	               
	private String codpromo;                               
	                                                       
	@Column(name = "NUMPER", length = 10)	                 
	private String numper;                                 
	                                                       
	@Column(name = "NUMPER_AVAL", length = 10)	           
	private String numperaval;                            
	                                                       
	@Column(name = "INDCTAEMP", length = 01)	             
	private String indctaemp;                              
	                                                       
	@Column(name = "INDNOMEMP", length = 04)	             
	private int indnomemp;                                 
	                                                       
	@Column(name = "NOMBREEMP", length = 30)	             
	private String nombreemp;                              
	                                                       
	@Column(name = "CODREGIMEN", length = 04)	             
	private int codregimen;                                
	                                                       
	@Column(name = "FORPAGO", length = 04)	               
	private int forpago;                                   
	                                                       
	@Column(name = "INDSITCTA", length = 04)	             
	private int indsitcta;                                 
	                                                       
	@Column(name = "GRUPOLIQ", length = 04)	               
	private int grupoliq;                                  
	                                                       
	@Column(name = "GRUPOCUO", length = 04)	               
	private int grupocuo;                                  
	                                                       
	@Column(name = "OFIVEN", length = 04)	                 
	private String ofiven;                                 
	                                                       
	@Column(name = "CLAMON_1", length = 04)	               
	private int clamon1;                                  
	                                                       
	@Column(name = "LIMCRECTA_1", length = 17)	           
	private int limcrecta1;                               
	                                                       
	@Column(name = "IMPFPAGOA_1", length = 17)	           
	private int impfpagoa1;                               
	                                                       
	@Column(name = "LIMCRECOM_1", length = 17)	           
	private int limcrecom1;                               
	                                                       
	@Column(name = "LIMCRECOMG_1", length = 17)	           
	private int limcrecomg1;                              
	                                                       
	@Column(name = "CLAMON_2", length = 04)	               
	private int clamon2;                                  
	                                                       
	@Column(name = "LIMCRECTA_2", length = 17)	           
	private int limcrecta2;                               
	                                                       
	@Column(name = "IMPFPAGOA_2", length = 17)	           
	private int impfpagoa2;                               
	                                                       
	@Column(name = "LIMCRECOM_2", length = 17)	           
	private int limcrecom2;                               
	                                                       
	@Column(name = "LIMCRECOMG_2", length = 17)	           
	private int limcrecomg2;                              
	                                                       
	@Column(name = "CTACARGO_1", length = 30)	             
	private String ctacargo1;                             
	                                                       
	@Column(name = "CLAMON_CON_1", length = 04)	           
	private int clamoncon1;                              
	                                                       
	@Column(name = "INDDOMCARCRE", length = 01)	           
	private int INDDOMCARCRE;                              
	                                                       
	@Column(name = "CODFORMATO", length = 10)	             
	private String codformato;                             
	                                                       
	@Column(name = "CTADOM_TAR1", length = 30)	           
	private String ctadomtar1;                            
	                                                       
	@Column(name = "MONCTA_TAR1", length = 04)	           
	private int monctatar1;                               
	                                                       
	@Column(name = "INDACTPAS1", length = 01)	             
	private String indactpas1;                             
	                                                       
	@Column(name = "CTADOM_TAR2", length = 30)	           
	private String ctadomtar2;                            
	                                                       
	@Column(name = "MONCTA_TAR2", length = 04)	           
	private int monctatar2;                               
	                                                       
	@Column(name = "INDACTPAS2", length = 01)	             
	private String indactpas2;                             
	                                                       
	@Column(name = "NUMPER_TAR", length = 10)	             
	private String numpertar;                             
	                                                       
	@Column(name = "CALPART_TAR", length = 02)	           
	private String calparttar;                            
	                                                       
	@Column(name = "INDTIPT_TAR", length = 04)	           
	private int indtipttar;                               
	                                                       
	@Column(name = "CODMAR_TAR", length = 04)	             
	private int codmartar;                                
	                                                       
	@Column(name = "NOMBENRED_TAR", length = 26)	         
	private String nombenredtar;                          
	                                                       
	@Column(name = "IDEMPLEADO_TAR", length = 20)	         
	private String idempleadotar;                         
	                                                       
	@Column(name = "PANASOC_TAR", length = 22)	           
	private String panasoctar;                            
	                                                       
	@Column(name = "CODBARRAS_TAR", length = 14)	         
	private int codbarrastar;                             
	                                                       
	@Column(name = "REFFOTO_TAR", length = 30)	           
	private String reffototar;                            
	                                                       
	@Column(name = "ESTPLAS_TAR1", length = 40)	           
	private String estplastar1;                           
	                                                       
	@Column(name = "ESTPLAS_TAR2", length = 40)	           
	private String estplastar2;                           
	                                                       
	@Column(name = "IDENVEST_TAR", length = 01)	           
	private String idenvesttar;                           
	                                                       
	@Column(name = "CENTEST_TAR", length = 04)	           
	private String centesttar;                            
	                                                       
	@Column(name = "INDENVPIN_TAR", length = 01)	         
	private String IndenvpinTar;                          
	                                                       
	@Column(name = "CENTPIN_TAR", length = 04)	           
	private String centpintar;                            
	                                                       
	@Column(name = "CONDEST_TAR", length = 03)	           
	private String condesttar;                            
	                                                       
	@Column(name = "CODPROMO_TAR", length = 03)	           
	private String codpromotar;                           
	                                                       
	@Column(name = "CLAMON_1_TAR", length = 04)	           
	private int clamon1tar;                              
	                                                       
	@Column(name = "LIMDIACAJ_1_TAR", length = 17)	       
	private int limdiacaj1tar;                           
	                                                       
	@Column(name = "MAXDIACAJ_1_TAR", length = 9)	         
	private int maxdiacaj1tar;                           
	                                                       
	@Column(name = "CLAMON_2_TAR", length = 9)	           
	private int clamon2tar;                              
	                                                       
	@Column(name = "LIMDIACAJ_2_TAR", length = 17)	       
	private int limdiacaj2tar;                           
	                                                       
	@Column(name = "MAXDIACAJ_2_TAR", length = 9)	       
	private int maxdiacaj2tar;                           
	                                                       
	@Column(name = "CUENTA", length = 12)	                 
	private String cuenta;                                 
	                                                       
	@Column(name = "DESCLAMON", length = 20)	             
	private String desclamon;                              
	                                                       
	@Column(name = "FECALTA", length = 10)	               
	private String fecalta;                                
	                                                       
	@Column(name = "PAN_TAR", length = 22)	               
	private String pantar;                                
	                                                       
	@Column(name = "FECALTA_TAR", length = 10)	           
	private String fecaltatar;                            
	                                                       
	@Column(name = "FECCAD_TAR", length = 9)	             
	private int feccadtar;                                
	                                                       
	@Column(name = "DESMARRED_TAR", length = 10)	         
	private String DESMARREDTAR;                          
	                                                       
	@Column(name = "DESTIPTRED_TAR", length = 10)	         
	private String destiptredtar;                         
	                                                       
	@Column(name = "INDSITTAR_TAR", length = 04)	         
	private int indsittartar;                             
	                                                       
	@Column(name = "DESSITTAR_TAR", length = 30)	         
	private String dessittartar;                          
	                                                       
	@Column(name = "FECCOBCUO", length = 9)	             
	private int feccobcuo;                                 
	                                                       
	@Column(name = "DESCLAMON1", length = 20)	             
	private String desclamon1;                             
	                                                       
	@Column(name = "DESCLAMON2", length = 20)	             
	private String desclamon2;                             
	                                                       
	@Column(name = "CONTCUR", length = 26)	               
	private String contcur;                                
	                                                       
	@Column(name = "NSECFIC_CAB", length = 10)	           
	private int nsecficcab;                               
	                                                       
	@Column(name = "TIPOCINTA_CAB", length = 02)	         
	private int tipocintacab;                             
	                                                       
	@Column(name = "NUMREGTOT_CAB", length = 12)	         
	private int numregtotcab;                             
	                                                       
	@Column(name = "EDOCINTA_CAB", length = 01)	           
	private String edocintacab;                           
	                                                       
	@Column(name = "VALIDACION_CAB", length = 01)	         
	private String validacioncab;                         
	                                                       
	@Column(name = "NSECFIC_DET", length = 10)	           
	private int nsecficdet;                               
	                                                       
	@Column(name = "TIPOCINTA_DET", length = 02)	         
	private int tipocintadet;                             
	                                                       
	@Column(name = "INDCAMPOINFO_DET", length = 100)	     
	private String indcampoinfodet;                       
	                                                       
	@Column(name = "TIPOBON_C1", length = 06)	             
	private String tipobonc1;                             
	                                                       
	@Column(name = "RESEMIEXT", length = 12)	             
	private String resemiext;                              
	                                                       
	@Column(name = "INDPERCUO", length = 01)	             
	private String indpercuo;                              
	                                                       
	@Column(name = "NUMMESTOT", length = 04)	             
	private int nummestot;                                 
	                                                       
	@Column(name = "NUMFACSC", length = 04)	               
	private int numfacsc;                                  
	                                                       
	@Column(name = "SEQPLASTICO", length = 9)	           
	private int seqplastico;                               
	                                                       
	@Column(name = "TIPOBON_T1", length = 06)	             
	private String tipobont1;                             
	                                                       
	@Column(name = "INDACTLIM", length = 01)	             
	private String indactlim;                              
	                                                       
	@Column(name = "INDCAMLIM", length = 01)	             
	private String indcamlim;                              
	                                                       
	@Column(name = "VISAPHONE", length = 04)	             
	private int visaphone;                                 
	                                                       
	@Column(name = "INDFOTO", length = 01)	               
	private String indfoto;                                
	                                                       
	@Column(name = "MAXOPER", length = 04)	               
	private int maxoper;                                   
	                                                       
	@Column(name = "MAXODIA", length = 9)	               
	private int maxodia;                                   
	                                                       
	@Column(name = "INDCTA", length = 01)	                 
	private String indcta;                                 
	                                                       
	@Column(name = "INDAJENA", length = 01)	               
	private String indajena;                               
	                                                       
	@Column(name = "INDTIPCTA", length = 02)	             
	private String indtipcta;                              
	                                                       
	@Column(name = "CCCPRODUC", length = 02)	             
	private String cccproduc;                              
	                                                       
	@Column(name = "CCCSUBPRO", length = 04)	             
	private String cccsubpro;                              
	                                                       
	@Column(name = "NSECFIC_FIN", length = 10)	           
	private String nsecficfin;                            
	                                                       
	@Column(name = "TIPOCINTA_FIN", length = 10)	         
	private String tipocintafin;                          
	                                                       
	@Column(name = "EDOCINTA_FIN", length = 10)	           
	private String edocintafin;                           
	                                                       
	@Column(name = "VALIDACION_FIN", length = 10)	         
	private String VALIDACIONFIN;                         
	                                                       
	@Column(name = "LIMCRETAR", length = 17)	             
	private int limcretar;                                 
	                                                       
	@Column(name = "LIMCREMES", length = 17)               
	private int limcremes;                                 
	                                                       
	@Column(name = "LIMDEBMES", length = 17)               
	private int limdebmes;                                 
	                                                       
	@Column(name = "LIMCREDIA", length = 17)               
	private int limcredia;                                 
	                                                       
	@Column(name = "LIMDEBDIA", length = 17)               
	private int limdebdia;

	public String getCodent() {
		return codent;
	}

	public void setCodent(String codent) {
		this.codent = codent;
	}

	public String getCentalta() {
		return centalta;
	}

	public void setCentalta(String centalta) {
		this.centalta = centalta;
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

	public String getCondpro() {
		return condpro;
	}

	public void setCondpro(String condpro) {
		this.condpro = condpro;
	}

	public String getCodcam() {
		return codcam;
	}

	public void setCodcam(String codcam) {
		this.codcam = codcam;
	}

	public String getCodconven() {
		return codconven;
	}

	public void setCodconven(String codconven) {
		this.codconven = codconven;
	}

	public String getCodpromo() {
		return codpromo;
	}

	public void setCodpromo(String codpromo) {
		this.codpromo = codpromo;
	}

	public String getNumper() {
		return numper;
	}

	public void setNumper(String numper) {
		this.numper = numper;
	}

	public String getNumperaval() {
		return numperaval;
	}

	public void setNumperaval(String numperaval) {
		this.numperaval = numperaval;
	}

	public String getIndctaemp() {
		return indctaemp;
	}

	public void setIndctaemp(String indctaemp) {
		this.indctaemp = indctaemp;
	}

	public int getIndnomemp() {
		return indnomemp;
	}

	public void setIndnomemp(int indnomemp) {
		this.indnomemp = indnomemp;
	}

	public String getNombreemp() {
		return nombreemp;
	}

	public void setNombreemp(String nombreemp) {
		this.nombreemp = nombreemp;
	}

	public int getCodregimen() {
		return codregimen;
	}

	public void setCodregimen(int codregimen) {
		this.codregimen = codregimen;
	}

	public int getForpago() {
		return forpago;
	}

	public void setForpago(int forpago) {
		this.forpago = forpago;
	}

	public int getIndsitcta() {
		return indsitcta;
	}

	public void setIndsitcta(int indsitcta) {
		this.indsitcta = indsitcta;
	}

	public int getGrupoliq() {
		return grupoliq;
	}

	public void setGrupoliq(int grupoliq) {
		this.grupoliq = grupoliq;
	}

	public int getGrupocuo() {
		return grupocuo;
	}

	public void setGrupocuo(int grupocuo) {
		this.grupocuo = grupocuo;
	}

	public String getOfiven() {
		return ofiven;
	}

	public void setOfiven(String ofiven) {
		this.ofiven = ofiven;
	}

	public int getClamon1() {
		return clamon1;
	}

	public void setClamon1(int clamon1) {
		this.clamon1 = clamon1;
	}

	public int getLimcrecta1() {
		return limcrecta1;
	}

	public void setLimcrecta1(int limcrecta1) {
		this.limcrecta1 = limcrecta1;
	}

	public int getImpfpagoa1() {
		return impfpagoa1;
	}

	public void setImpfpagoa1(int impfpagoa1) {
		this.impfpagoa1 = impfpagoa1;
	}

	public int getLimcrecom1() {
		return limcrecom1;
	}

	public void setLimcrecom1(int limcrecom1) {
		this.limcrecom1 = limcrecom1;
	}

	public int getLimcrecomg1() {
		return limcrecomg1;
	}

	public void setLimcrecomg1(int limcrecomg1) {
		this.limcrecomg1 = limcrecomg1;
	}

	public int getClamon2() {
		return clamon2;
	}

	public void setClamon2(int clamon2) {
		this.clamon2 = clamon2;
	}

	
	public int getLimcrecta2() {
		return limcrecta2;
	}

	public void setLimcrecta2(int limcrecta2) {
		this.limcrecta2 = limcrecta2;
	}

	public int getImpfpagoa2() {
		return impfpagoa2;
	}

	public void setImpfpagoa2(int impfpagoa2) {
		this.impfpagoa2 = impfpagoa2;
	}

	public int getLimcrecom2() {
		return limcrecom2;
	}

	public void setLimcrecom2(int limcrecom2) {
		this.limcrecom2 = limcrecom2;
	}

	public int getLimcrecomg2() {
		return limcrecomg2;
	}

	public void setLimcrecomg2(int limcrecomg2) {
		this.limcrecomg2 = limcrecomg2;
	}

	public String getCtacargo1() {
		return ctacargo1;
	}

	public void setCtacargo1(String ctacargo1) {
		this.ctacargo1 = ctacargo1;
	}

	public int getClamoncon1() {
		return clamoncon1;
	}

	public void setClamoncon1(int clamoncon1) {
		this.clamoncon1 = clamoncon1;
	}

	public int getINDDOMCARCRE() {
		return INDDOMCARCRE;
	}

	public void setINDDOMCARCRE(int iNDDOMCARCRE) {
		INDDOMCARCRE = iNDDOMCARCRE;
	}

	public String getCodformato() {
		return codformato;
	}

	public void setCodformato(String codformato) {
		this.codformato = codformato;
	}

	public String getCtadomtar1() {
		return ctadomtar1;
	}

	public void setCtadomtar1(String ctadomtar1) {
		this.ctadomtar1 = ctadomtar1;
	}

	public int getMonctatar1() {
		return monctatar1;
	}

	public void setMonctatar1(int monctatar1) {
		this.monctatar1 = monctatar1;
	}

	public String getIndactpas1() {
		return indactpas1;
	}

	public void setIndactpas1(String indactpas1) {
		this.indactpas1 = indactpas1;
	}

	public String getCtadomtar2() {
		return ctadomtar2;
	}

	public void setCtadomtar2(String ctadomtar2) {
		this.ctadomtar2 = ctadomtar2;
	}

	public int getMonctatar2() {
		return monctatar2;
	}

	public void setMonctatar2(int monctatar2) {
		this.monctatar2 = monctatar2;
	}

	public String getIndactpas2() {
		return indactpas2;
	}

	public void setIndactpas2(String indactpas2) {
		this.indactpas2 = indactpas2;
	}

	public String getNumpertar() {
		return numpertar;
	}

	public void setNumpertar(String numpertar) {
		this.numpertar = numpertar;
	}

	public String getCalparttar() {
		return calparttar;
	}

	public void setCalparttar(String calparttar) {
		this.calparttar = calparttar;
	}

	public int getIndtipttar() {
		return indtipttar;
	}

	public void setIndtipttar(int indtipttar) {
		this.indtipttar = indtipttar;
	}

	public int getCodmartar() {
		return codmartar;
	}

	public void setCodmartar(int codmartar) {
		this.codmartar = codmartar;
	}

	public String getNombenredtar() {
		return nombenredtar;
	}

	public void setNombenredtar(String nombenredtar) {
		this.nombenredtar = nombenredtar;
	}

	public String getIdempleadotar() {
		return idempleadotar;
	}

	public void setIdempleadotar(String idempleadotar) {
		this.idempleadotar = idempleadotar;
	}

	public String getPanasoctar() {
		return panasoctar;
	}

	public void setPanasoctar(String panasoctar) {
		this.panasoctar = panasoctar;
	}

	public int getCodbarrastar() {
		return codbarrastar;
	}

	public void setCodbarrastar(int codbarrastar) {
		this.codbarrastar = codbarrastar;
	}

	public String getReffototar() {
		return reffototar;
	}

	public void setReffototar(String reffototar) {
		this.reffototar = reffototar;
	}

	public String getEstplastar1() {
		return estplastar1;
	}

	public void setEstplastar1(String estplastar1) {
		this.estplastar1 = estplastar1;
	}

	public String getEstplastar2() {
		return estplastar2;
	}

	public void setEstplastar2(String estplastar2) {
		this.estplastar2 = estplastar2;
	}

	public String getIdenvesttar() {
		return idenvesttar;
	}

	public void setIdenvesttar(String idenvesttar) {
		this.idenvesttar = idenvesttar;
	}

	public String getCentesttar() {
		return centesttar;
	}

	public void setCentesttar(String centesttar) {
		this.centesttar = centesttar;
	}

	public String getIndenvpinTar() {
		return IndenvpinTar;
	}

	public void setIndenvpinTar(String indenvpinTar) {
		IndenvpinTar = indenvpinTar;
	}

	public String getCentpintar() {
		return centpintar;
	}

	public void setCentpintar(String centpintar) {
		this.centpintar = centpintar;
	}

	public String getCondesttar() {
		return condesttar;
	}

	public void setCondesttar(String condesttar) {
		this.condesttar = condesttar;
	}

	public String getCodpromotar() {
		return codpromotar;
	}

	public void setCodpromotar(String codpromotar) {
		this.codpromotar = codpromotar;
	}

	public int getClamon1tar() {
		return clamon1tar;
	}

	public void setClamon1tar(int clamon1tar) {
		this.clamon1tar = clamon1tar;
	}

	public int getLimdiacaj1tar() {
		return limdiacaj1tar;
	}

	public void setLimdiacaj1tar(int limdiacaj1tar) {
		this.limdiacaj1tar = limdiacaj1tar;
	}

	public int getMaxdiacaj1tar() {
		return maxdiacaj1tar;
	}

	public void setMaxdiacaj1tar(int maxdiacaj1tar) {
		this.maxdiacaj1tar = maxdiacaj1tar;
	}

	public int getClamon2tar() {
		return clamon2tar;
	}

	public void setClamon2tar(int clamon2tar) {
		this.clamon2tar = clamon2tar;
	}

	public int getLimdiacaj2tar() {
		return limdiacaj2tar;
	}

	public void setLimdiacaj2tar(int limdiacaj2tar) {
		this.limdiacaj2tar = limdiacaj2tar;
	}

	public int getMaxdiacaj2tar() {
		return maxdiacaj2tar;
	}

	public void setMaxdiacaj2tar(int maxdiacaj2tar) {
		this.maxdiacaj2tar = maxdiacaj2tar;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDesclamon() {
		return desclamon;
	}

	public void setDesclamon(String desclamon) {
		this.desclamon = desclamon;
	}

	public String getFecalta() {
		return fecalta;
	}

	public void setFecalta(String fecalta) {
		this.fecalta = fecalta;
	}

	public String getPantar() {
		return pantar;
	}

	public void setPantar(String pantar) {
		this.pantar = pantar;
	}

	public String getFecaltatar() {
		return fecaltatar;
	}

	public void setFecaltatar(String fecaltatar) {
		this.fecaltatar = fecaltatar;
	}

	public int getFeccadtar() {
		return feccadtar;
	}

	public void setFeccadtar(int feccadtar) {
		this.feccadtar = feccadtar;
	}

	public String getDESMARREDTAR() {
		return DESMARREDTAR;
	}

	public void setDESMARREDTAR(String dESMARREDTAR) {
		DESMARREDTAR = dESMARREDTAR;
	}

	public String getDestiptredtar() {
		return destiptredtar;
	}

	public void setDestiptredtar(String destiptredtar) {
		this.destiptredtar = destiptredtar;
	}

	public int getIndsittartar() {
		return indsittartar;
	}

	public void setIndsittartar(int indsittartar) {
		this.indsittartar = indsittartar;
	}

	public String getDessittartar() {
		return dessittartar;
	}

	public void setDessittartar(String dessittartar) {
		this.dessittartar = dessittartar;
	}

	public int getFeccobcuo() {
		return feccobcuo;
	}

	public void setFeccobcuo(int feccobcuo) {
		this.feccobcuo = feccobcuo;
	}

	public String getDesclamon1() {
		return desclamon1;
	}

	public void setDesclamon1(String desclamon1) {
		this.desclamon1 = desclamon1;
	}

	public String getDesclamon2() {
		return desclamon2;
	}

	public void setDesclamon2(String desclamon2) {
		this.desclamon2 = desclamon2;
	}

	public String getContcur() {
		return contcur;
	}

	public void setContcur(String contcur) {
		this.contcur = contcur;
	}

	public int getNsecficcab() {
		return nsecficcab;
	}

	public void setNsecficcab(int nsecficcab) {
		this.nsecficcab = nsecficcab;
	}

	public int getTipocintacab() {
		return tipocintacab;
	}

	public void setTipocintacab(int tipocintacab) {
		this.tipocintacab = tipocintacab;
	}

	public int getNumregtotcab() {
		return numregtotcab;
	}

	public void setNumregtotcab(int numregtotcab) {
		this.numregtotcab = numregtotcab;
	}

	public String getEdocintacab() {
		return edocintacab;
	}

	public void setEdocintacab(String edocintacab) {
		this.edocintacab = edocintacab;
	}

	public String getValidacioncab() {
		return validacioncab;
	}

	public void setValidacioncab(String validacioncab) {
		this.validacioncab = validacioncab;
	}

	public int getNsecficdet() {
		return nsecficdet;
	}

	public void setNsecficdet(int nsecficdet) {
		this.nsecficdet = nsecficdet;
	}

	public int getTipocintadet() {
		return tipocintadet;
	}

	public void setTipocintadet(int tipocintadet) {
		this.tipocintadet = tipocintadet;
	}

	public String getIndcampoinfodet() {
		return indcampoinfodet;
	}

	public void setIndcampoinfodet(String indcampoinfodet) {
		this.indcampoinfodet = indcampoinfodet;
	}

	public String getTipobonc1() {
		return tipobonc1;
	}

	public void setTipobonc1(String tipobonc1) {
		this.tipobonc1 = tipobonc1;
	}

	public String getResemiext() {
		return resemiext;
	}

	public void setResemiext(String resemiext) {
		this.resemiext = resemiext;
	}

	public String getIndpercuo() {
		return indpercuo;
	}

	public void setIndpercuo(String indpercuo) {
		this.indpercuo = indpercuo;
	}

	public int getNummestot() {
		return nummestot;
	}

	public void setNummestot(int nummestot) {
		this.nummestot = nummestot;
	}

	public int getNumfacsc() {
		return numfacsc;
	}

	public void setNumfacsc(int numfacsc) {
		this.numfacsc = numfacsc;
	}

	public int getSeqplastico() {
		return seqplastico;
	}

	public void setSeqplastico(int seqplastico) {
		this.seqplastico = seqplastico;
	}

	public String getTipobont1() {
		return tipobont1;
	}

	public void setTipobont1(String tipobont1) {
		this.tipobont1 = tipobont1;
	}

	public String getIndactlim() {
		return indactlim;
	}

	public void setIndactlim(String indactlim) {
		this.indactlim = indactlim;
	}

	public String getIndcamlim() {
		return indcamlim;
	}

	public void setIndcamlim(String indcamlim) {
		this.indcamlim = indcamlim;
	}

	public int getVisaphone() {
		return visaphone;
	}

	public void setVisaphone(int visaphone) {
		this.visaphone = visaphone;
	}

	public String getIndfoto() {
		return indfoto;
	}

	public void setIndfoto(String indfoto) {
		this.indfoto = indfoto;
	}

	public int getMaxoper() {
		return maxoper;
	}

	public void setMaxoper(int maxoper) {
		this.maxoper = maxoper;
	}

	public int getMaxodia() {
		return maxodia;
	}

	public void setMaxodia(int maxodia) {
		this.maxodia = maxodia;
	}

	public String getIndcta() {
		return indcta;
	}

	public void setIndcta(String indcta) {
		this.indcta = indcta;
	}

	public String getIndajena() {
		return indajena;
	}

	public void setIndajena(String indajena) {
		this.indajena = indajena;
	}

	public String getIndtipcta() {
		return indtipcta;
	}

	public void setIndtipcta(String indtipcta) {
		this.indtipcta = indtipcta;
	}

	public String getCccproduc() {
		return cccproduc;
	}

	public void setCccproduc(String cccproduc) {
		this.cccproduc = cccproduc;
	}

	public String getCccsubpro() {
		return cccsubpro;
	}

	public void setCccsubpro(String cccsubpro) {
		this.cccsubpro = cccsubpro;
	}

	public String getNsecficfin() {
		return nsecficfin;
	}

	public void setNsecficfin(String nsecficfin) {
		this.nsecficfin = nsecficfin;
	}

	public String getTipocintafin() {
		return tipocintafin;
	}

	public void setTipocintafin(String tipocintafin) {
		this.tipocintafin = tipocintafin;
	}

	public String getEdocintafin() {
		return edocintafin;
	}

	public void setEdocintafin(String edocintafin) {
		this.edocintafin = edocintafin;
	}

	public String getVALIDACIONFIN() {
		return VALIDACIONFIN;
	}

	public void setVALIDACIONFIN(String vALIDACIONFIN) {
		VALIDACIONFIN = vALIDACIONFIN;
	}

	public int getLimcretar() {
		return limcretar;
	}

	public void setLimcretar(int limcretar) {
		this.limcretar = limcretar;
	}

	public int getLimcremes() {
		return limcremes;
	}

	public void setLimcremes(int limcremes) {
		this.limcremes = limcremes;
	}

	public int getLimdebmes() {
		return limdebmes;
	}

	public void setLimdebmes(int limdebmes) {
		this.limdebmes = limdebmes;
	}

	public int getLimcredia() {
		return limcredia;
	}

	public void setLimcredia(int limcredia) {
		this.limcredia = limcredia;
	}

	public int getLimdebdia() {
		return limdebdia;
	}

	public void setLimdebdia(int limdebdia) {
		this.limdebdia = limdebdia;
	}

}
