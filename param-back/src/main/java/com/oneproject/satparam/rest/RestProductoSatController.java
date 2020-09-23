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

import com.oneproject.satparam.modelo.ProductoSat;
import com.oneproject.satparam.modelo.ProductoSatId;
import com.oneproject.satparam.repositorio.IProductoSat;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/productoSat")

public class RestProductoSatController {

	@Autowired
	private IProductoSat repo;
	
	@GetMapping()
	public List<ProductoSat> listar(){
		System.out.println("Iniciando consulta general");
		return repo.findAll();
	}
	
    @GetMapping("/{id}")
    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<ProductoSat> listarId(@PathVariable String id){
    	System.out.println("Iniciando consulta de ParamSat por ID: " + id );
    	if (id.length() == 12) {
    		String codNrbeEnt = id.substring(0,4);
    		//System.out.println(codNrbeEnt);
    		String idPrdSat = id.substring(4,6);
    		//System.out.println(idPrdSat);
    		String idSPrdSat = id.substring(6,10);
    		//System.out.println(idSPrdSat);
    		String codLinea = id.substring(10,12);
    		//System.out.println(codLinea);

    		System.out.print("Entidad: " + codNrbeEnt + " " + "IdProducto: " + idPrdSat+ " " + "SubProducto: " + idSPrdSat+ " "+ "Linea: " + codLinea );
    		ProductoSatId idProductoSat = new ProductoSatId();

    		idProductoSat.setCodNrbeEnt(codNrbeEnt);
    		idProductoSat.setIdPrdSat(idPrdSat);
    		idProductoSat.setIdSPrdSat(idSPrdSat);
    		idProductoSat.setCodLinea(codLinea);

    		return repo.findById(idProductoSat);
    	}
    	else {
    		System.out.println("Error: Id inválido - " + id );
    		return null;
    	}
    }

	@PostMapping
	public void insertar(@RequestBody ProductoSat producto){
		System.out.println("Body: " +"/n" + producto.toString());
		repo.save(producto);
	}
	
	@PutMapping
	public void modificar(@RequestBody ProductoSat marca){
		System.out.println("Body: " +"/n" + marca.toString());
		repo.save(marca);
	}
		
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") String id){
		String codNrbeEnt = id.substring(0,4);
    	String idPrdSat = id.substring(4,6);
    	String idSPrdSat = id.substring(6,10);
    	String codLinea = id.substring(10,12);
    	
    	if (id.length() == 12) {
    		System.out.print("Entidad: " + codNrbeEnt + " " + "IdProducto: " + idPrdSat+ " " + "SubProducto: " + idSPrdSat+ " "+ "Linea: " + codLinea );

    		ProductoSatId idProductoSat = new ProductoSatId();

    		idProductoSat.setCodNrbeEnt(codNrbeEnt);
    		idProductoSat.setIdPrdSat(idPrdSat);
    		idProductoSat.setIdSPrdSat(idSPrdSat);
    		idProductoSat.setCodLinea(codLinea);

    		repo.deleteById(idProductoSat);
    	}
    	else {
    		System.out.println("Error: Id inválido - " + id );
    	}
	}

}
