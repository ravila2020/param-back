

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

import com.oneproject.satparam.modelo.Mpdt025;
import com.oneproject.satparam.modelo.Mpdt025Id;
import com.oneproject.satparam.repositorio.IMpdt025Repo;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/mpdt025")
public class RestDemoControllerMP25 {

	@Autowired
	private IMpdt025Repo repo;
	
	@GetMapping
	public List<Mpdt025> listar(){
		return repo.findAll();
	}
	
    @GetMapping(path = {"/{id}"})
    public Optional<Mpdt025> listarId(@PathVariable("id") String id){
    	String codent  = id.substring(0,4);
    	String codmar  = id.substring(4,6);
    	String indtipt  = id.substring(6,8);
 		Integer icodmar = Integer.valueOf(codmar); 
 		Integer iindtipt = Integer.valueOf(indtipt);
   	
		System.out.print("codent: " + codent + " " + "codmar: " + codmar + " " + "indtipt: " + indtipt + " ");
		Mpdt025Id llave25 = new Mpdt025Id();
		
		llave25.setCodent(codent);
		

        return repo.findById(llave25);
    }

	@PostMapping
	public void insertar(@RequestBody Mpdt025 marca){
		repo.save(marca);
	}
	
	@PutMapping
	public void modificar(@RequestBody Mpdt025 marca){
		repo.save(marca);
	}
		
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") String id){
    	String codent  = id.substring(0,4);
    	String codmar  = id.substring(4,6);
    	String indtipt  = id.substring(6,8);
 		
    	Integer icodmar = Integer.valueOf(codmar); 
 		Integer iindtipt = Integer.valueOf(indtipt);
   	
		Mpdt025Id llave25 = new Mpdt025Id();
		
		llave25.setCodent(codent);
		
		
		repo.deleteById(llave25);
	}

}
