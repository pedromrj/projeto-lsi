package br.com.unifacisa.lsi.aluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.lsi.aluno.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
