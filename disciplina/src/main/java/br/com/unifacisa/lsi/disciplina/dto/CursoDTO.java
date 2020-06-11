package br.com.unifacisa.lsi.disciplina.dto;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CursoDTO {

	private Long id;

	private Integer codigo;

	private String nome;
	
	private List<Integer> disciplinasId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Integer> getDisciplinasId() {
		return disciplinasId;
	}

	public void setDisciplinasId(List<Integer> disciplinasId) {
		this.disciplinasId = disciplinasId;
	}
	
	

}
