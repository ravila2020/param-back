package com.oneproject.satparam.repositorio;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oneproject.satparam.modelo.Mpdt025;

public interface IMpdt025Repo extends JpaRepository<Mpdt025, String>{
	@Query("select m from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo ")
	Optional<Mpdt025> findByEntidadAndMarcaAndTipo(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo);

	@Query("select m from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo and m.binenttip = :binenttip and m.binproc = :binproc and m.numulttar = :numulttar")
	Optional<Mpdt025> findByTodos(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo,@Param("binenttip") String binenttip, @Param("binproc") String binproc, @Param("numulttar") long numulttar);

	
    @Transactional
	@Modifying
	@Query("delete from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo ")
	Integer deleteByEntidadAndMarcaAndTipo(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo);
    
    @Transactional
 	@Modifying
 	@Query("delete from Mpdt025 m where m.codent = :entidad and m.codmar = :marca and m.indtipt = :tipo and m.binenttip = :binenttip and m.binproc = :binproc and m.numulttar = :numulttar")
 	Integer deleteByTodos(@Param("entidad") String entidad, @Param("marca") int marca, @Param("tipo") int tipo,@Param("binenttip") String binenttip, @Param("binproc") String binproc, @Param("numulttar") long numulttar);
    
}