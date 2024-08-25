package com.learning.spring.checklis_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ChecklisApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChecklisApiApplication.class, args);
	}



	//Busca por id
//	public Categoria find(Integer id){
//		Optional<Categoria> obj = repo.findById(id);
//		return obj.orElse(null);
//	}
}
