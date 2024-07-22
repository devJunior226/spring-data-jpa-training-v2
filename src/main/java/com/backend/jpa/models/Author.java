package com.backend.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data // includes @Getter, @Setter and @AllArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Author {

   @Id
   @GeneratedValue
   private Integer id;

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

















