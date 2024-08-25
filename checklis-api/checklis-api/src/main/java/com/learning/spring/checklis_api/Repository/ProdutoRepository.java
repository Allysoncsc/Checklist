package com.learning.spring.checklis_api.Repository;

import com.learning.spring.checklis_api.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {



}
