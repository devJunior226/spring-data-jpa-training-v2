package com.backend.jpa.models;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

   private LocalDateTime createdAt;

   private String createdBy;

   private LocalDateTime lastModifiedAt;

   private LocalDateTime lastModifiedBy;

}
