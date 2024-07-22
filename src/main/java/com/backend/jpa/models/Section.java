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
public class Section {

   @Id
   @GeneratedValue
   private Integer id;

   private String name;

   private int sectionOrder;


   /**
    * OneToMany relationship setting up
    * Reference to Section entity
    * Many sections belong to one Course
    */
   @ManyToOne
   @JoinColumn(name = "course_id")
   private Course course;

   // OneToMany between Section and Lecture
   @OneToMany(mappedBy = "section")
   private List<Lecture> lectures;


   /**
    * OnToOne relationship
    * 1srt way: bidirectional mapping
    */
   @OneToOne
   @JoinColumn(name = "resource_id")
   private Resource resource;
}



























