package com.learning.spring.checklis_api.Repository;

import com.learning.spring.checklis_api.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {



}
