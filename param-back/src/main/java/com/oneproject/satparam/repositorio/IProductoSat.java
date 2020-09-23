package com.oneproject.satparam.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneproject.satparam.modelo.ProductoSat;
import com.oneproject.satparam.modelo.ProductoSatId;

public interface IProductoSat extends JpaRepository<ProductoSat, ProductoSatId> {

}
