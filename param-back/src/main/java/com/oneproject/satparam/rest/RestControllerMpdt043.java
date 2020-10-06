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

import com.oneproject.satparam.modelo.Mpdt043;
import com.oneproject.satparam.modelo.Mpdt043Id;
import com.oneproject.satparam.repositorio.mpdt043Repo;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/mpdt043")

public class RestControllerMpdt043 {

	@Autowired
	private mpdt043Repo repo;

	@GetMapping
	public List<Mpdt043> listar() {
		System.out.print("ENTRA A METODO LIST...........");
		return repo.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Mpdt043> listarId(@PathVariable("id") String id) {
		System.out.print("ENTRA A METODO GET ID...........");
		String buscar = "=";
		int intIndex = id.indexOf(buscar);

		id = id.substring(intIndex + 1);

		System.out.print(id);
		
		String codent = id.substring(0, 4);
		String producto = id.substring(4, 6);
		String subprodu = id.substring(6, 10);

		System.out.print("codent: " + codent + " " + "producto: " + producto + " " + "subprodu: " + subprodu);

		Mpdt043Id pk = new Mpdt043Id();

		pk.setCodent(codent);
		pk.setProducto(producto);
		pk.setSubprodu(subprodu);

		return repo.findById(pk);

	}
	
	
	@PostMapping
	public void insertar(@RequestBody Mpdt043 registro){
		System.out.print("ENTRA A METODO INSERTAR...........");
		repo.save(registro);
	}
	
	@PutMapping
	public void modificar(@RequestBody Mpdt043 registro){
		repo.save(registro);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") String id){
		
		System.out.print("ENTRA A METODO...........");
    	String buscar="=";
        int intIndex = id.indexOf(buscar);
        
        id = id.substring(intIndex+1);
    	
    	String codent  = id.substring(0,4);
    	String producto  = id.substring(4,6);
    	String subprodu  = id.substring(6,10);
    	
    	System.out.print("codent: " + codent + " " + "producto: " + producto + " "+ "subprodu: " + subprodu);
   	
    	Mpdt043Id pk = new Mpdt043Id();
		
		pk.setCodent(codent);
		pk.setProducto(producto);
		pk.setSubprodu(subprodu);
		
		repo.deleteById(pk);
	}
	
	
	@GetMapping("/Srvmp04301")
	public List<String> listEntidades(){
		return repo.findEntidadesProd();
	}
	
	@GetMapping("/Srvmp04302/{id}")
	public List<String> listProdu(@PathVariable("id") String id){
		
    	String buscar="=";
        int intIndex = id.indexOf(buscar);
        
        String entidad = id.substring(intIndex+1);

		return repo.findProductosProd(entidad);
	}

	@GetMapping("/Srvmp04303/{id}")
	public List<String> listSubProdu(@PathVariable("id") String id){
		
    	String buscar="=";
        int intIndex = id.indexOf(buscar);
        
        id = id.substring(intIndex+1);
    	
    	String entidad  = id.substring(0,4);
    	String producto  = id.substring(4,6);

		return repo.findSubProductosProd(entidad, producto);
	}

	@GetMapping( "/FindProductos/{id}")
	public List<Mpdt043> findId(@PathVariable("id") String id) {
		System.out.print("ENTRA A METODO FindProductos ...........");
		String buscar = "=";
		int intIndex = id.indexOf(buscar);

		id = id.substring(intIndex + 1);

		System.out.print(id);
		
		String codent = id.substring(0, 4);
		String producto = id.substring(4, 6);
		String subprodu = id.substring(6, 10);


		return repo.findProductos(codent, producto, subprodu);

	}

}
