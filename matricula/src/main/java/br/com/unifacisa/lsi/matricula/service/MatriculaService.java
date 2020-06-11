package br.com.unifacisa.lsi.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.unifacisa.lsi.matricula.dto.AlunoDTO;
import br.com.unifacisa.lsi.matricula.dto.CursoDTO;
import br.com.unifacisa.lsi.matricula.dto.DisciplinaDTO;
import br.com.unifacisa.lsi.matricula.entities.Matricula;
import br.com.unifacisa.lsi.matricula.repositories.MatriculaRepository;

@Service
public class MatriculaService {

	@Value("${ip.apigateway}")
	private String uri;

	@Autowired
	private RestTemplate client;

	@Autowired
	private MatriculaRepository repository;

	public ResponseEntity<Matricula> realizarMatricula(Matricula matricula) {

		try {
			ResponseEntity<CursoDTO> exchange = client.getForEntity(uri.concat("/api/curso/") + matricula.getCursoId(), CursoDTO.class);

			ResponseEntity<AlunoDTO> exchange1 = client.getForEntity(uri.concat("/api/aluno/") + matricula.getAlunoId(), AlunoDTO.class);
			
			if (exchange1.getBody().getIdcurso() != matricula.getCursoId() ) {
				return ResponseEntity.badRequest().build();
			}

			for (Long i : matricula.getDisciplinaIds()) {

				ResponseEntity<DisciplinaDTO> exchange2 = client.getForEntity(uri.concat("/api/disciplina/") + i, DisciplinaDTO.class);
				
				if (exchange2.getBody().getCodCurso() != matricula.getCursoId()) {
					return ResponseEntity.badRequest().build();
				}

			}

		} catch (Exception e) {
			if (e.getMessage().contains("404")) {
				return ResponseEntity.badRequest().build();
			}
			throw e;
		}
		
		return ResponseEntity.ok().body(repository.save(matricula));

	}

}
