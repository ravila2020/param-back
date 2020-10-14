package com.oneproject.satparam.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oneproject.satparam.modelo.Mpdt088;
import com.oneproject.satparam.modelo.Mpdt088Id;


public interface IMpdt088Repo extends JpaRepository<Mpdt088, Mpdt088Id> {
	
	
}

