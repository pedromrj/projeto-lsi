package br.com.unifacisa.lsi.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.lsi.curso.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

	
}
