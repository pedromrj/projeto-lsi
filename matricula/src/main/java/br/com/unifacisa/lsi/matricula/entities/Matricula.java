package br.com.unifacisa.lsi.matricula.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Matricula {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	
	private Long alunoId;
	
	private Long cursoId;
	
	@ElementCollection
	private List<Long> disciplinaIds;

	public Matricula(Long id, Long alunoId, Long cursoId, List<Long> disciplinaIds) {
		this.id = id;
		this.alunoId = alunoId;
		this.cursoId = cursoId;
		this.disciplinaIds = disciplinaIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	public Long getCursoId() {
		return cursoId;
	}

	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}

	public List<Long> getDisciplinaIds() {
		return disciplinaIds;
	}

	public void setDisciplinaIds(List<Long> disciplinaIds) {
		this.disciplinaIds = disciplinaIds;
	}

}
