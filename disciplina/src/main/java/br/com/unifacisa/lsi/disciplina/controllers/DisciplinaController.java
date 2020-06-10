package br.com.unifacisa.lsi.disciplina.controllers;

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

import br.com.unifacisa.lsi.disciplina.entities.Disciplina;
import br.com.unifacisa.lsi.disciplina.repositories.DisciplinaRepository;

@RestController
@RequestMapping("/professor")
public class DisciplinaController {

	@Autowired
	private DisciplinaRepository repository;

	@GetMapping
	private ResponseEntity<List<Disciplina>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Disciplina> findOne(@PathVariable Long id) {
		return repository.findById(id).map(
				aluno -> ResponseEntity.ok().body(aluno))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	private ResponseEntity<Disciplina> save(@RequestBody Disciplina obj ) {
		return ResponseEntity.ok().body(repository.save(obj));
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<Disciplina> update(@PathVariable Long id,@RequestBody Disciplina obj) {
		return ResponseEntity.ok().body(repository.save(obj));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Disciplina> update(@PathVariable Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}
}
