package com.backend.jpa.repositories;

import com.backend.jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends
    JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {





   // NameQuery
  List<Author> findByNamedQuery(@Param("age") int age);

  // Update authors age using named query method
  @Modifying
  @Transactional
 void updateAuthorAgeByNamedQuery(@Param("age") int age);



   // Update query with JPQL
   // update Author author set author.age = 22 where author.id = 1
   @Modifying
   @Transactional // put in mind when we need to use a query annotation
   @Query("update Author author set author.age = :age where author.id = :id")
   int updateAuthor(int age, int id);


   // update all authors
   @Modifying
   @Transactional
   @Query("update Author author set author.age = :age")
   void updateAllAuthorAges(int age);




   /**
    * FindAll by firstname
    * Equivalent to select * from author where first_name = 'First Name entered by user'
    */
   List<Author> findAllByFirstName(String first_name);


   // Ignore case for all names
   List<Author> findAllByFirstNameIgnoreCase(String first_name);


   // Names containing a certain character
   // Equivalent to select * from author where first_name like '%user_character%'
   List<Author> findAllByFirstNameContainingIgnoreCase(String first_name);


   // Names starting with a certain character
   // Equivalent to select * from author where first_name like 'user_character%'
   List<Author> findAllByFirstNameStartsWithIgnoreCase(String first_name);


   // Names ending with a certain character
   // Equivalent to select * from author where first_name like '%user_character'
   List<Author> findAllByFirstNameEndsWithIgnoreCase(String first_name);


   // Fetch names where the firstname is in a list
   // select * from author where first_name in ('pikachu', 'juldas', 'dev')
   List<Author> findAllByFirstNameInIgnoreCase(List<String> first_names);
}























