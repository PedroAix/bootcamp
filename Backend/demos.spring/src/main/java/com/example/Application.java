package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.domains.contracts.repositories.CategoryRepository;
import com.example.domains.contracts.repositories.CiudadesRepository;
import com.example.domains.contracts.repositories.FilmRepository;
import com.example.domains.contracts.repositories.LanguageRepository;
import com.example.domains.contracts.repositories.RentalRepository;
import com.example.ioc.Servicio;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
//	@Autowired
//	FilmRepository dao;
	
	@Autowired
	RentalRepository dao;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
