package com.learning.spring.checklis_api;

import com.learning.spring.checklis_api.Repository.CategoriaRepository;
import com.learning.spring.checklis_api.Repository.ProdutoRepository;
import com.learning.spring.checklis_api.domain.Categoria;
import com.learning.spring.checklis_api.domain.Produto;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class ChecklisApiApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChecklisApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");

		Produto p1 = new Produto(2000.00,"Computador",null);
		Produto p2 = new Produto(800.00,"Impressora",null);
		Produto p3 = new Produto(80.00,"Mouse",null);

		cat1.setProdutos(Arrays.asList(p1,p2,p3));
		cat2.setProdutos(Arrays.asList(p2));

		p1.setCategorias(Arrays.asList(cat1));
		p2.setCategorias(Arrays.asList(cat1,cat2));
		p3.setCategorias(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}


	//Busca por id
//	public Categoria find(Integer id){
//		Optional<Categoria> obj = repo.findById(id);
//		return obj.orElse(null);
//	}
//	categoriaRepository.saveAll(Arrays.asList(cat1,cat2));

//	public Categoria find(Integer){
//		Optional<Categoria> obj = repo.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException(
//				"Objeto não encontrado!! Id: "+id+", Tipo: "+Categoria.class.getName()));
//	}
}
