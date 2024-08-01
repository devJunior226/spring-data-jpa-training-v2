package com.backend.jpa.models.embedded;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_table")
public class Order {

   // OrderId should implement Serializable
   // interface because it is an embedded id
   // And this looks like the primary key
   @EmbeddedId
   private OrderId id;

   private String orderInfo;

   private String anotherField;
}
