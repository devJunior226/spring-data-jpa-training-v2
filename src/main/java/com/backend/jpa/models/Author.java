package com.backend.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {

   @Column(name = "author_firstname", length = 35)
   private String firstName;

   @Column(name = "author_lastname")
   private String lastName;

   @Column(unique = true, nullable = false)
   private String email;

   private int age;

   /**
    * ManyToMany relationship setting up
    * Reference to Course entity
    */
   @ManyToMany(mappedBy = "authors")
   private List<Course> courses;

}

















