package com.oneproject.satparam.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oneproject.satparam.modelo.ProductoSat;
import com.oneproject.satparam.modelo.ProductoSatId;

import java.util.List;

public interface IProductoSat extends JpaRepository<ProductoSat, ProductoSatId> {
	
	@Query("Select DISTINCT (p.codNrbeEn) from ProductoSat p")
	List<String> findEntidades();
	                
	@Query("Select DISTINCT (p.idPrdSat) from ProductoSat p where codNrbeEn = :idEntidad")
	List<String> findProductos(@Param("idEntidad") String idEntidad);
	
	@Query("Select DISTINCT (p.idSPrdSat) from ProductoSat p where codNrbeEn = :entidad and idPrdSat = :idPrd")
	List<String> findSubProductos(@Param("entidad") String entidad, @Param("idPrd") String idPrd );
	
	@Query("Select DISTINCT (p.idSPrdSat) from ProductoSat p where codNrbeEn = :idEntidad and idPrdSat = :idPrd" +
	       " and idSPrdSat = :idSPrd")
	List<String> findCodLineas(@Param("idEntidad") String idEntidad, 
			                   @Param("idPrd") String idPrd, 
			                   @Param("idSPrd") String idSPrd);
	
	@Query("Select p from ProductoSat p where codNrbeEn = :idEntidad")
	List<ProductoSat> findInfProductosEntidad(@Param("idEntidad") String idEntidad);
}
