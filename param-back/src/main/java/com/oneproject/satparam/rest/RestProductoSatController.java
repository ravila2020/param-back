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
    		String codNrbeEn = id.substring(0,4);
    		//System.out.println(codNrbeEnt);
    		String idPrdSat = id.substring(4,6);
    		//System.out.println(idPrdSat);
    		String idSPrdSat = id.substring(6,10);
    		//System.out.println(idSPrdSat);
    		String codLinea = id.substring(10,12);
    		//System.out.println(codLinea);

    		System.out.print("Entidad: " + codNrbeEn + " " + "IdProducto: " + idPrdSat+ " " + "SubProducto: " + idSPrdSat+ " "+ "Linea: " + codLinea );
    		ProductoSatId idProductoSat = new ProductoSatId();

    		idProductoSat.setCodNrbeEn(codNrbeEn);
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
		String codNrbeEn = id.substring(0,4);
    	String idPrdSat = id.substring(4,6);
    	String idSPrdSat = id.substring(6,10);
    	String codLinea = id.substring(10,12);
    	
    	if (id.length() == 12) {
    		System.out.print("Entidad: " + codNrbeEn + " " + "IdProducto: " + idPrdSat+ " " + "SubProducto: " + idSPrdSat+ " "+ "Linea: " + codLinea );

    		ProductoSatId idProductoSat = new ProductoSatId();

    		idProductoSat.setCodNrbeEn(codNrbeEn);
    		idProductoSat.setIdPrdSat(idPrdSat);
    		idProductoSat.setIdSPrdSat(idSPrdSat);
    		idProductoSat.setCodLinea(codLinea);

    		repo.deleteById(idProductoSat);
    	}
    	else {
    		System.out.println("Error: Id inválido - " + id );
    	}
	}

	@GetMapping("/entidades")
	public List<String> listEntidades(){
		return repo.findEntidades();
	}
	
	@GetMapping("/productos/{idEntidad}")
	public List<String> listProductos(@PathVariable("idEntidad") String idEntidad){
		return repo.findProductos(idEntidad);
	}
	
	@GetMapping("/subproductos/{id}")
	public List<String> listSubProductos(@PathVariable("id") String id){
		System.out.println("lisSubproductos id : "+ id);
		String idEntidad = id.substring(0,4);
		System.out.println("lisSubproductos idEntidad : "+ idEntidad);
		String idProducto = id.substring(4,6);
		System.out.println("lisSubproductos idProducto : "+ idProducto);
		return repo.findSubProductos(idEntidad, idProducto);
	}
	
	@GetMapping("/lineas/{id}")
	public List<String> listCodLineas(@PathVariable("id") String id){
		String idEntidad = id.substring(0,4);
		String idProducto = id.substring(4,6);
		String idSubProducto = id.substring(6,10);
		return repo.findCodLineas(idEntidad, idProducto, idSubProducto);
	}
	
	@GetMapping("/productosentidad/{idEntidad}")
	public List<ProductoSat> listProductosEntidad(@PathVariable("idEntidad") String idEntidad){
		return repo.findInfProductosEntidad(idEntidad);
	}
	 
}
