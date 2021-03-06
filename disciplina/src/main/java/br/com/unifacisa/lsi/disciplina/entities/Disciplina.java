package br.com.unifacisa.lsi.disciplina.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	
	private Long codCurso;
	
	private Long codProf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(Long codCurso) {
		this.codCurso = codCurso;
	}

	public Long getCodProf() {
		return codProf;
	}

	public void setCodProf(Long codProf) {
		this.codProf = codProf;
	}
	
	
	
}
