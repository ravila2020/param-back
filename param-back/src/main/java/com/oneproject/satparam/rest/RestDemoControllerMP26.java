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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oneproject.satparam.modelo.Mpdt026;
import com.oneproject.satparam.modelo.Mpdt026Id;
import com.oneproject.satparam.repositorio.IMpdt026Repo;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/mpdt026")

public class RestDemoControllerMP26 {
	@Autowired
	private IMpdt026Repo repo;
	
	@GetMapping
	public List<Mpdt026> list026(){
		return repo.findAll();
		
	}
	
	@GetMapping(path= {"/{id}"})
	public Optional<Mpdt026> listarID(@PathVariable("id") String id){
		String codent = id.substring(0,4);
		String codmar = id.substring(4,6);
		
		System.out.printf("codent" +codent , "codmar" + codmar);
		Mpdt026Id llave026 = new Mpdt026Id();
		
		llave026.setCodent(codent);
		llave026.setCodmar(codmar);
		
		return repo.findById(llave026);
	}
	
	@GetMapping(path= {"/"})
	public List<Mpdt026>list026Filtro(@RequestParam("entidad") String entidad, @RequestParam("marca") String marca){
		
		return (List<Mpdt026>) repo.findByEntidadOrMarca(entidad.toString(),marca.toString());
		
	}

	@GetMapping(path= {"/entidad"})
	public List<String> list026Entidad(){
		
		return  repo.findByEntidad();
		
	}

	@GetMapping(path= {"/marca"})
	public List<String> list026Marca(@RequestParam("entidad") String entidad){
		System.out.printf(" codent" +entidad + "                           ");
		return  repo.findByMarca(entidad);
		
	}

	@GetMapping(path= {"/itipotarj"})
	public List<String> list026Itipotarj(@RequestParam("entidad") String entidad, @RequestParam("marca") String marca){
		
		System.out.printf(" codent" +entidad + "codmar" + marca + "                           ");
		
		return  repo.findByindtipt(entidad,marca);
	}

	
	@PostMapping
	public void insertar(@RequestBody Mpdt026 marca) {
		repo.save(marca);
	}
	
	@PutMapping
	public void modificar(@RequestBody Mpdt026 marca) {
		repo.save(marca);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") String id) {
		String codent = id.substring(0,4);
		String codmar = id.substring(4,6);
		
		Mpdt026Id llave026 = new Mpdt026Id();
		
		llave026.setCodent(codent);
		llave026.setCodmar(codmar);
		
		repo.deleteById(llave026);
		
	}
}
