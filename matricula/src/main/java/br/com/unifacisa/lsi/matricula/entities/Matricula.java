package br.com.unifacisa.lsi.matricula.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	
	private Long alunoId;
	
	private Long cursoId;
	
	@ElementCollection
	private List<Long> disciplinaIds;

}
