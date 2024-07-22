package com.backend.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course {

   @Id
   @GeneratedValue
   private Integer id;

   private String name;

   private String description;

   /**
    * ManyToMany relationship setting up
    * Reference to Author entity
    */
   // This make Author as the owner of the relationship
   @ManyToMany
   @JoinTable(
       name = "authors_courses",
       joinColumns = {@JoinColumn(name = "course_id")},
       inverseJoinColumns = {@JoinColumn(name = "author_id")}
   )
   private List<Author> authors;


   /**
    * OneToMany relationship setting up
    * Reference to Section entity
    */
   @OneToMany(mappedBy = "course")
   private List<Section> sections;
}




















