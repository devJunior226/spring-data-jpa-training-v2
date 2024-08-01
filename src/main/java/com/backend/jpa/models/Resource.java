package com.backend.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "resource_type") --> only with SINGLE_TABLE
public class Resource {
   @Id
   @GeneratedValue
   private Integer id;

   private String name;

   private int size;

   private String url;


   /**
    * OnToOne relationship
    * 1srt way: bidirectional mapping
    */
   @OneToOne
   @JoinColumn(name = "lecture_id")
   private Lecture lecture;
}































