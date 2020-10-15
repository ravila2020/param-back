

package com.oneproject.satparam.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oneproject.satparam.modelo.Mpdt025;
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
	
//    @GetMapping(path = {"/{id}"})
//    public Optional<Mpdt025> listarId(@PathVariable("id") String id){
//    	String codent  = id.substring(0,4);
//    	String codmar  = id.substring(4,6);
//    	String indtipt  = id.substring(6,8);
// 		Integer icodmar = Integer.valueOf(codmar); 
// 		Integer iindtipt = Integer.valueOf(indtipt);
//   	
//		System.out.print("codent: " + codent + " " + "codmar: " + codmar + " " + "indtipt: " + indtipt + " ");
//		Mpdt025Id llave25 = new Mpdt025Id();
//		
//		llave25.setCodent(codent);
//		
//
//        return repo.findByEntidadAndMarcaAndTipo(codent,icodmar,iindtipt);
//    }

    
    @GetMapping(path = {"/unico"})
    public Optional<Mpdt025> listarId(
			@RequestParam(required = false, value = "codent") String codent,
			@RequestParam(required = false, value = "codmar") int codmar,
			@RequestParam(required = false, value = "indtipt") int indtipt,
			@RequestParam(required = false, value = "binenttip") String binenttip,
			@RequestParam(required = false, value = "binproc") String binproc,
            @RequestParam(required = false, value = "numulttar") long numulttar){
   			System.out.print("codent: " + codent + " codmar: " + codmar + " indtipt: " + indtipt + 
		         "binenttip: " + binenttip + " " + "binproc: " + binproc + " " + "numulttar: " + numulttar );	
		
        return repo.findByTodos(codent,codmar,indtipt,binenttip,binproc,numulttar);
    }

    
	@PostMapping
	public void insertar(@RequestBody Mpdt025 marca){
	System.out.print("codent: " + marca.getCodent() + " " + "codmar: " + marca.getCodmar() + " " + "indtipt: " + marca.getIndtipt() + " "); 
		repo.save(marca);
	}

	@PostMapping(path = {"/complex"})
	public void insertarCplx(@RequestBody Mpdt025 marca) {
		repo.saveByTodos(marca.getCodent(),
				marca.getCodmar(),
				marca.getIndtipt(),
				marca.getBinenttip(),
				marca.getBinproc(),
				marca.getNumulttar(),
				marca.getInddebcre(),
				marca.getIndbinemp(),
				marca.getRangosup(),
				marca.getRangoinf(),
				marca.getRutinapan(),
				marca.getCodserv(),
				marca.getGencarpin(),
				marca.getIndintpan(),
				marca.getIndcmbpan(),
				marca.getIndcmbpin(),
				marca.getNummesproren(),
				marca.getNummintar(),
				marca.getNummaxdia(),
				marca.getTecnologia(),
				marca.getIndgenvisaphone(),
				marca.getIndacttar(),
				marca.getFecalta(),
				marca.getFecini(),
				marca.getFecfin(),
				marca.getGruafin(),
				marca.getPorcesafin(),
				marca.getPorbontitafin(),
				marca.getIndadmpres(),
				marca.getIndpinpres(),
				marca.getVigtarpre(),
				marca.getIndmesvigmin(),
				marca.getCodclave(),
				marca.getIndrescli(),
				marca.getFecexpmon(),
				marca.getExponente(),
				marca.getNumkpin(),
				marca.getPista1(),
				marca.getPista2(),
				marca.getTamcodbarr(),
				marca.getForestamp(), 
				marca.getIndtarvir(), 
				marca.getIndoffpvv(), 
				marca.getCodentumo(), 
				marca.getCodofiumo(), 
				marca.getUsuarioumo(),
				marca.getCodtermumo(),
				marca.getContcur()			);
	}
		
	
	
	@PutMapping
	public void modificar(@RequestBody Mpdt025 marca){
		repo.save(marca);
	}
		
	@DeleteMapping
	public void eliminar(
			@RequestParam(required = false, value = "codent") String codent,
			@RequestParam(required = false, value = "codmar") int codmar,
			@RequestParam(required = false, value = "indtipt") int indtipt,
			@RequestParam(required = false, value = "binenttip") String binenttip,
			@RequestParam(required = false, value = "binproc") String binproc,
            @RequestParam(required = false, value = "numulttar") long numulttar){

 	
		System.out.print("codent: " + codent + " codmar: " + codmar + " indtipt: " + indtipt + 
				         "binenttip: " + binenttip + " " + "binproc: " + binproc + " " + "numulttar: " + numulttar );	
		repo.deleteByTodos(codent,codmar,indtipt,binenttip,binproc,numulttar);
	}

	
	/*
	 * @DeleteMapping(value = "/{id}") public void eliminar(@PathVariable("id")
	 * String id){ String codent = id.substring(0,4); String codmar =
	 * id.substring(4,6); String indtipt = id.substring(6,8); String binenttip
	 * String binproc String numulttar Integer icodmar = Integer.valueOf(codmar);
	 * Integer iindtipt = Integer.valueOf(indtipt);
	 * 
	 * System.out.print("codent: " + codent + " " + "codmar: " + codmar + " " +
	 * "indtipt: " + indtipt + " ");
	 * 
	 * repo.deleteByEntidadAndMarcaAndTipo(codent,icodmar,iindtipt); }
	 */
	
	
}
