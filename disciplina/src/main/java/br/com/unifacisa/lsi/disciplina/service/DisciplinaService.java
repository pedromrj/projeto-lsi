package br.com.unifacisa.lsi.disciplina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.unifacisa.lsi.disciplina.dto.CursoDTO;
import br.com.unifacisa.lsi.disciplina.entities.Disciplina;
import br.com.unifacisa.lsi.disciplina.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Value("${ip.apigateway}")
	private String uri;
	
	@Autowired
	private RestTemplate client;
	
	@Autowired
	private DisciplinaRepository repository;
	
	public ResponseEntity<Disciplina> save(Disciplina obj) {
		try {
			ResponseEntity<CursoDTO> curso = client.getForEntity(uri.concat("/api/curso/") + obj.getCodCurso() , CursoDTO.class);
			ResponseEntity<CursoDTO> prof = client.getForEntity(uri.concat("/api/professor/") + obj.getCodProf(), CursoDTO.class);
			return ResponseEntity.ok().body(repository.save(obj));
		} catch(Exception e) {
			if (e.getMessage().contains("404")) {
				return ResponseEntity.badRequest().build();
			}
			throw e;
		}
	}

}
