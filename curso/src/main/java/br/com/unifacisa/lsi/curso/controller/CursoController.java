package br.com.unifacisa.lsi.curso.controller;

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

import br.com.unifacisa.lsi.curso.entities.Curso;
import br.com.unifacisa.lsi.curso.repositories.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoRepository repository;

	@GetMapping
	private ResponseEntity<List<Curso>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Curso> findOne(@PathVariable Long id) {
		return repository.findById(id).map(
				aluno -> ResponseEntity.ok().body(aluno))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	private ResponseEntity<Curso> save(@RequestBody Curso obj ) {
		return ResponseEntity.ok().body(repository.save(obj));
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<Curso> update(@PathVariable Long id,@RequestBody Curso obj) {
		return ResponseEntity.ok().body(repository.save(obj));
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Curso> update(@PathVariable Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}
}
