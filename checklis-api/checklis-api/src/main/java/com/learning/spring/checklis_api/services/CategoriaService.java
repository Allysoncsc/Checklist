package com.learning.spring.checklis_api.services;


import com.learning.spring.checklis_api.Repository.CategoriaRepository;
import com.learning.spring.checklis_api.domain.Categoria;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;


    	public Categoria buscar(Integer id){
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
                Optional.of("Objeto não encontrado! Id: " + id), Categoria.class.getName()
        ));
	}
//    public Categoria buscar(Integer id){
//        Optional<Categoria> obj = repo.findById(id);
//        return obj.orElse(null);
//    }
}
