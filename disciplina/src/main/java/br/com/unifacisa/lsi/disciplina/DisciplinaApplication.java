package br.com.unifacisa.lsi.disciplina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DisciplinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisciplinaApplication.class, args);
	}

}
