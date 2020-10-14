package com.oneproject.satparam.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oneproject.satparam.modelo.Mpdt061;

public interface IMpdt061Repo extends JpaRepository<Mpdt061, String>{

	
	@Query("select DISTINCT  (m.Binpre) from Mpdt061 m")
	List<String> findByBinpre();
	
	@Query("select DISTINCT  (m.Rangosup) from Mpdt061 m")
	List<String> findByRangosup();
	
	@Query("select DISTINCT  (m.Rangoinf) from Mpdt061 m")
	List<String> findByRangoinf();

}