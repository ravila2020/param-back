package com.oneproject.satparam.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oneproject.satparam.modelo.ProductoSat;
import com.oneproject.satparam.modelo.ProductoSatId;

import java.util.List;

public interface IProductoSat extends JpaRepository<ProductoSat, ProductoSatId> {
	
	@Query("Select DISTINCT (m.codNrbeEn) from ProductoSat m")
	List<String> findEntidades();
	                
}
