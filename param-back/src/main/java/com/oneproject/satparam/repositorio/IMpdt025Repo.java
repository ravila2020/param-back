package com.oneproject.satparam.repositorio;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oneproject.satparam.modelo.Mpdt025;
import com.oneproject.satparam.modelo.Mpdt025Id;

public interface IMpdt025Repo extends JpaRepository<Mpdt025, Mpdt025Id>{
	
	@Query("select m from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo ")
	Optional<Mpdt025> findByEntidadAndMarcaAndTipo(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo);

	@Query("select m from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo and m.binenttip = :binenttip and m.binproc = :binproc and m.numulttar = :numulttar")
	Optional<Mpdt025> findByTodos(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo,@Param("binenttip") String binenttip, @Param("binproc") String binproc, @Param("numulttar") long numulttar);

	
    @Transactional
	@Modifying
	@Query("delete from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo ")
	Integer deleteByEntidadAndMarcaAndTipo(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo);
    
    @Transactional
 	@Modifying
 	@Query("delete from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo and m.binenttip = :binenttip and m.binproc = :binproc and m.numulttar = :numulttar")
 	Integer deleteByTodos(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo,@Param("binenttip") String binenttip, @Param("binproc") String binproc, @Param("numulttar") long numulttar);
    

    
    
    @Transactional
 	@Modifying   
	@Query(nativeQuery = true, value ="insert into Mpdt025 m (m.codent, m.codmar, m.indtipt, m.binenttip, m.binproc,"
			+ " m.numulttar, m.inddebcre, m.indbinemp, m.rangosup, m.rangoinf, m.rutinapan, m.codserv, m.gencarpin, m.indintpan, m.indcmbpan, "
			+ "m.indcmbpin, m.nummesproren, m.nummintar, m.nummaxdia, m.tecnologia, m.indgenvisaphone, m.indacttar, "
			+ "m.fecalta, m.fecini, m.fecfin, m.gruafin, m.porcesafin, m.porbontitafin, m.indadmpres, m.indpinpres, "
			+ "m.vigtarpre, m.indmesvigmin, m.codclave, m.indrescli, m.fecexpmon, m.exponente, m.numkpin, m.pista1, "
			+ "m.pista2, m.tamcodbarr, m.tamcodbarr,m.forestamp ,m.indtarvir ,m.indoffpvv ,m.codentumo ,"  
			+ "m.codofiumo ,m.usuarioumo,m.codtermumo,m.contcur) values "
			+ "  (:codentx, :codmarx, :indtiptx, :binenttipx, :binprocx, :numulttarx, :inddebcrex, :indbinempx, :rangosupx,"
			+ " :rangoinfx, :rutinapanx, :codservx, :gencarpinx, :indintpanx, :indcmbpanx, :indcmbpinx, :nummesprorenx, :nummintarx,"
			+ " :nummaxdiax, :tecnologiax, :indgenvisaphonex, :indacttarx, :fecaltax, :fecinix, :fecfinx, :gruafinx, :porcesafinx,"
			+ " :porbontitafinx, :indadmpresx, :indpinpresx, :vigtarprex, :indmesvigminx, :codclavex, :indresclix, :fecexpmonx,"
			+ " :exponentex, :numkpinx, :pista1x, :pista2x, :tamcodbarrx,:forestampx ,:indtarvirx ,:indoffpvvx ,:codentumox ," 
			+ ":codofiumox ,:usuarioumox, :codtermumox,:contcurx)")
	int saveByTodos(@Param("codentx") String codentx ,
					@Param("codmarx") int codmarx ,
					@Param("indtiptx") int indtiptx ,
					@Param("binenttipx") String binenttipx , 
					@Param("binprocx") String binprocx ,
					@Param("numulttarx") long numulttarx,    
					@Param("inddebcrex") int inddebcrex ,
					@Param("indbinempx") String indbinempx ,
					@Param("rangosupx") String rangosupx ,
					@Param("rangoinfx") String rangoinfx ,
					@Param("rutinapanx") String rutinapanx ,
					@Param("codservx") int codservx ,
					@Param("gencarpinx") String gencarpinx , 
					@Param("indintpanx") String indintpanx ,
					@Param("indcmbpanx") String indcmbpanx ,
					@Param("indcmbpinx") String indcmbpinx ,
					@Param("nummesprorenx") int nummesprorenx ,  
					@Param("nummintarx") int nummintarx ,
					@Param("nummaxdiax") int nummaxdiax ,
					@Param("tecnologiax") String tecnologiax ,
					@Param("indgenvisaphonex") String indgenvisaphonex,  
					@Param("indacttarx") int indacttarx ,
					@Param("fecaltax") String fecaltax ,
					@Param("fecinix") String fecinix ,
					@Param("fecfinx") String fecfinx ,
					@Param("gruafinx") String gruafinx ,
					@Param("porcesafinx") int porcesafinx ,  
					@Param("porbontitafinx") int porbontitafinx,    
					@Param("indadmpresx") String indadmpresx ,
					@Param("indpinpresx") String indpinpresx ,
					@Param("vigtarprex") int vigtarprex ,
					@Param("indmesvigminx") int indmesvigminx,  
					@Param("codclavex") String codclavex ,
					@Param("indresclix") String indresclix ,
					@Param("fecexpmonx") String fecexpmonx ,
					@Param("exponentex") int exponentex ,
					@Param("numkpinx") int numkpinx ,
					@Param("pista1x") String pista1x ,
					@Param("pista2x") String pista2x ,
					@Param("tamcodbarrx") int tamcodbarrx,
					@Param("forestampx") String  forestampx,
					@Param("indtarvirx") String  indtarvirx,
					@Param("indoffpvvx") String  indoffpvvx,
					@Param("codentumox") String  codentumox,
					@Param("codofiumox") String  codofiumox,
					@Param("usuarioumox") String  usuarioumox,
					@Param("codtermumox") String  codtermumox,
					@Param("contcurx") String  contcurx);
		}