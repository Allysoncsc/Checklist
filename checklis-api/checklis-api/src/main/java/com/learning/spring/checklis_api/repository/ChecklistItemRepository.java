package com.learning.spring.checklis_api.repository;

import com.learning.spring.checklis_api.entity.ChecklistItemEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ChecklistItemRepository extends PagingAndSortingRepository<ChecklistItemEntity, Long> {

    Optional<ChecklistItemEntity> findByGuid(String guid);

   // List<ChecklistItemEntity> fidByDescriptionAndIsCompleted(String description, Boolean isCompletede);
}
