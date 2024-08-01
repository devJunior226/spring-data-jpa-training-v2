package com.backend.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
// Indicate that this class is a superclass that is mapped to a database table
// Is to define common properties that will shared by multiple entities
@MappedSuperclass
public class BaseEntity {

   @Id
   @GeneratedValue
   private Integer id;

   private LocalDateTime createdAt;

   private String createdBy;

   private LocalDateTime lastModifiedAt;

   private LocalDateTime lastModifiedBy;

}







