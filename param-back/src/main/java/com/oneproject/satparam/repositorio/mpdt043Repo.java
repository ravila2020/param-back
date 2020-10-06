package com.oneproject.satparam.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oneproject.satparam.modelo.Mpdt043;
import com.oneproject.satparam.modelo.Mpdt043Id;

public interface mpdt043Repo extends JpaRepository <Mpdt043, Mpdt043Id> {
	
	
	@Query("Select DISTINCT (m.codent) From Mpdt043 m Order By m.codent")
	List<String> findEntidadesProd();
	                
	@Query("Select DISTINCT (m.producto) from Mpdt043 m where m.codent = :entidad")
	List<String> findProductosProd(@Param("entidad") String entidad);
	
	@Query("Select DISTINCT (m.subprodu) from Mpdt043 m where m.codent = :entidad and producto = :producto")
	List<String> findSubProductosProd(@Param("entidad") String entidad, @Param("producto") String producto );
	
	@Query("Select m from Mpdt043 m where m.codent = :entidad or m.producto = :producto or m.subprodu = :subproducto")
	List<Mpdt043> findProductos(@Param("entidad") String entidad, @Param("producto") String producto, @Param("subproducto") String subproducto );
 
}


