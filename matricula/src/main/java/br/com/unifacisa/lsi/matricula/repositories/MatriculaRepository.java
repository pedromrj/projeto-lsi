package br.com.unifacisa.lsi.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.lsi.matricula.entities.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
