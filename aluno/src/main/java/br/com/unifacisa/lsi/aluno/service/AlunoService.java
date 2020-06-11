package br.com.unifacisa.lsi.aluno.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.unifacisa.lsi.aluno.dto.CursoDTO;
import br.com.unifacisa.lsi.aluno.entity.Aluno;
import br.com.unifacisa.lsi.aluno.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Value("${ip.apigateway}")
	private String uri;

	@Autowired
	private RestTemplate client;
	
	@Autowired
	private AlunoRepository repository;
	
	public ResponseEntity<Aluno> save(Aluno aluno) {
		try {
			ResponseEntity<CursoDTO> c = client.getForEntity(uri.concat("/api/curso/") + aluno.getIdcurso(), CursoDTO.class);
			return ResponseEntity.ok().body(repository.save(aluno));
		} catch(Exception e) {
			if (e.getMessage().contains("404")) {
				return ResponseEntity.badRequest().build();
			}
			throw e;
		}
	}
	
}
