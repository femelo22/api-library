package br.com.lfmelo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiLibraryApplication {

	//TODO: PADRONIZAR OS COMENTÁRIOS NO TOPO DA CLASSE, SEGUIR DO EXEMPLO BOOKREPOSITORYTEST

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiLibraryApplication.class, args);
	}

}
