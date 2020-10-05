package com.oneproject.satparam.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneproject.satparam.modelo.Mpdt061;
import com.oneproject.satparam.repositorio.IMpdt061Repo;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/mpdt061")

public class RestControllerMpdt061 {

	@Autowired
	private IMpdt061Repo repo;

	@GetMapping
	public List<Mpdt061> listar() {
		return repo.findAll();
	}

	
}
