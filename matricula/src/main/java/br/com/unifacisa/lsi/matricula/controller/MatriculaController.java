package br.com.unifacisa.lsi.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacisa.lsi.matricula.entities.Matricula;
import br.com.unifacisa.lsi.matricula.repositories.MatriculaRepository;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaRepository repository;
	
	@PostMapping
	public ResponseEntity<Matricula> realizaMatricula(@RequestBody Matricula matricula) {
		return ResponseEntity.ok(repository.save(matricula));
	}

}
