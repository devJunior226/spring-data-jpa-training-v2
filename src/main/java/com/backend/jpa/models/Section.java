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
public class Section extends BaseEntity{

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



























