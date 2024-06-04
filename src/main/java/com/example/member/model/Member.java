package com.example.member.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Marks this class as a JPA entity mapped to a database table
@Entity
// Specifies the name of the database table to which this entity is mapped
@Table(name = "member")
// Lombok annotation to generate a constructor with all arguments
@AllArgsConstructor
// Lombok annotation to generate a no-argument constructor
@NoArgsConstructor
// Lombok annotation to generate getter methods for all fields
@Getter
public class Member
{
   // Specifies the primary key of the entity
   @Id
   // Maps the field to the "mem_id" column in the "member" table
   @Column(name = "mem_id")
   private String id;

   // Maps the field to the "mem_name" column in the "member" table
   @Column(name = "mem_name")
   private String name;

   // Maps the field to the "mem_age" column in the "member" table
   @Column(name = "mem_age")
   private int age;

}
