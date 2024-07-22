package com.backend.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
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































