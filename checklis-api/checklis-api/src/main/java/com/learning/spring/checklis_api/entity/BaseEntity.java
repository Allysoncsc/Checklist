package com.learning.spring.checklis_api.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Data
@MappedSuperclass
public class BaseEntity {

    private String guid;



}
