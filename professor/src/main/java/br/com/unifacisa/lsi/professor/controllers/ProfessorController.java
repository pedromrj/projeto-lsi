package br.com.unifacisa.lsi.professor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.lsi.professor.entities.Professor;
import br.com.unifacisa.lsi.professor.repositories.ProfessorRepository;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorRepository repository;

	@GetMapping
	private ResponseEntity<List<Professor>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Professor> findOne(@PathVariable Long id) {
		return repository.findById(id).map(
				aluno -> ResponseEntity.ok().body(aluno))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	private ResponseEntity<Professor> save(@RequestBody Professor obj ) {
		return ResponseEntity.ok().body(repository.save(obj));
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<Professor> update(@PathVariable Long id,@RequestBody Professor obj) {
		return ResponseEntity.ok().body(repository.save(obj));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Professor> update(@PathVariable Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}
}
