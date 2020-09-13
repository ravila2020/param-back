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

import com.oneproject.satparam.modelo.Mpdt088;
import com.oneproject.satparam.modelo.Mpdt088Id;
import com.oneproject.satparam.repositorio.IMpdt088Repo;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/mpdt088")
public class RestDemoControllerMpdt088 {
	
	 @Autowired

     private IMpdt088Repo repo;

    

     @GetMapping

     public List<Mpdt088> listar(){

                    return repo.findAll();

     }

    

@GetMapping(path = {"/{id}"})

public Optional<Mpdt088> listarId(@PathVariable("id") String id){

     String codent  = id.substring(0,4);
     String producto  = id.substring(4,6);
     String subprodu  = id.substring(6,10);


 
                    Mpdt088Id llave88 = new Mpdt088Id();

                    llave88.setCodent(codent);
                    llave88.setProducto(producto);
                    llave88.setSubprodu(subprodu);




return repo.findById(llave88);

}



     @PostMapping

     public void insertar(@RequestBody Mpdt088 marca){

                    repo.save(marca);

     }

    

     @PutMapping

     public void modificar(@RequestBody Mpdt088 marca){
     //public void modificar(@RequestBody String marca){
    	 //System.out.println("recibi: " + marca);

                    repo.save(marca);
    	 //return;

     }

                   

     @DeleteMapping(value = "/{id}")

     public void eliminar(@PathVariable("id") String id){

       	 String codent  = id.substring(0,4);
         String producto  = id.substring(4,6);
         String subprodu = id.substring(6,10);

   
                    Mpdt088Id llave88 = new Mpdt088Id();

                  
                    llave88.setCodent(codent);
                    llave88.setProducto(producto);
                    llave88.setSubprodu(subprodu);


                    repo.deleteById(llave88);

     }

}
