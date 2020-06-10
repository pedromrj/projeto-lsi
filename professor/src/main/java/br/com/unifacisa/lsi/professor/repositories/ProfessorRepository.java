package br.com.unifacisa.lsi.professor.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unifacisa.lsi.professor.entities.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
