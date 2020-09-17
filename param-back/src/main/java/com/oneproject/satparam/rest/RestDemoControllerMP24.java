package com.oneproject.satparam.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneproject.satparam.modelo.Mpdt024;
import com.oneproject.satparam.modelo.Mpdt024Id;
import com.oneproject.satparam.repositorio.IMpdt024Repo;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/mpdt024")
public class RestDemoControllerMP24 {

	@Autowired
	private IMpdt024Repo repo;
	
	@GetMapping
	public List<Mpdt024> listar(){
		return repo.findAll();
	}
	
    @GetMapping(path = {"/{id}"})
    public Optional<Mpdt024> listarId(@PathVariable("id") String id){
    	String codent  = id.substring(0,4);
    	String codmar  = id.substring(4,6);
    	
 		Integer icodmar = Integer.valueOf(codmar); 
 		
   	
		System.out.print("codent: " + codent + " " + "codmar: " + codmar + " ");
		Mpdt024Id llave24 = new Mpdt024Id();
		
		llave24.setCodent(codent);
		llave24.setCodmar(icodmar);
		

        return repo.findById(llave24);
    }

	@PostMapping
	public void insertar(@RequestBody Mpdt024 marca){
		repo.save(marca);
	}
	
	@PutMapping
	public void modificar(@RequestBody Mpdt024 marca){
		repo.save(marca);
	}
		
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") String id){
    	String codent  = id.substring(0,4);
    	String codmar  = id.substring(4,6);
    	
 		Integer icodmar = Integer.valueOf(codmar); 
 		
   	
		Mpdt024Id llave24 = new Mpdt024Id();
		
		llave24.setCodent(codent);
		llave24.setCodmar(icodmar);
		
		
		repo.deleteById(llave24);
	}

}
