package com.backend.jpa.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

// We'll tell at hibernate and spring data generate
// speaking that this an embedded entity
@Embeddable
// Always implements Serializable
public class OrderId implements Serializable {

   private String username;

   private LocalDateTime orderDate;
}
