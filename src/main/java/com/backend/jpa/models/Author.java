package com.backend.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data // includes @Getter, @Setter and @AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AUTHOR_TBL")
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

   @Column(updatable = false, nullable = false)
   private LocalDateTime createdAt;

   @Column(insertable = false)
   private LocalDateTime lastModified;

}


