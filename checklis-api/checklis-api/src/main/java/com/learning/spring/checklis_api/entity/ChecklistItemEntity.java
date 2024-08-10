package com.learning.spring.checklis_api.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Data
@Entity(name = "CheckLisItem")
@Table(indexes = {@Index(name = "IDX_GUID_CAT", columnList = "guid")})
public class ChecklistItemEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checklistItemId;

    private String description;

    private boolean isCompleted;

    private LocalTime deadline;

    private LocalTime postedDate;

    @ManyToOne
    private CategoryEntity category;
}
