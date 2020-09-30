package com.oneproject.satparam.repositorio;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.oneproject.satparam.modelo.Mpdt026;
import com.oneproject.satparam.modelo.Mpdt026Id;

 
public interface IMpdt026Repo extends JpaRepository<Mpdt026 ,Mpdt026Id>{

	@Query("select m from Mpdt026 m where m.codent = :entidad or m.codmar = :marca")
	List<Mpdt026> findByEntidadOrMarca(@Param("entidad") String entidad, @Param("marca") String marca);
	
	
	@Query("select DISTINCT  (m.codent) from Mpdt026 m")
	List<String> findByEntidad();
	

}

