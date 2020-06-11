package br.com.unifacisa.lsi.matricula.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DisciplinaDTO {

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
