package br.com.unifacisa.lsi.aluno.controllers;

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

import br.com.unifacisa.lsi.aluno.entity.Aluno;
import br.com.unifacisa.lsi.aluno.repositories.AlunoRepository;
import br.com.unifacisa.lsi.aluno.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService service;

	@Autowired
	private AlunoRepository repository;

	@GetMapping
	private ResponseEntity<List<Aluno>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Aluno> findOne(@PathVariable Long id) {
		return repository.findById(id).map(
				aluno -> ResponseEntity.ok().body(aluno))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	private ResponseEntity<Aluno> save(@RequestBody Aluno obj ) {
		return service.save(obj);
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<Aluno> update(@PathVariable Long id,@RequestBody Aluno obj) {
		obj.setId(id);
		return service.save(obj);
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Aluno> delete(@PathVariable Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
		
	}
}
