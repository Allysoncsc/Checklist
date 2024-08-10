package com.learning.spring.checklis_api.repository;

import com.learning.spring.checklis_api.entity.CategoryEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface CategoryRepository extends PagingAndSortingRepository<CategoryEntity, Long> {

    //Optional<CategoryEntity> findByName(String name);

    Optional<CategoryEntity> findByGuid(String guid);
}
