package com.backend.jpa.models.specification;

import com.backend.jpa.models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {

   // Fetch authors by age
   public static Specification<Author> hasAge(int age) {
      return(
          Root<Author> root,
          CriteriaQuery<?> query,
          CriteriaBuilder builder
      ) -> {
         if (age < 0) {
            return null;
         }
         return builder.equal(root.get("age"), age);
      };
   }

   // Fetch authors by firstname containing character
   public static Specification<Author> firstNameLike(String firstname) {
      return(
          Root<Author> root,
          CriteriaQuery<?> query,
          CriteriaBuilder builder
      ) -> {
         if (firstname == null) {
            return null;
         }
         return builder.like(root.get("firstName"),"%" + firstname + "%");
      };
   }
}
