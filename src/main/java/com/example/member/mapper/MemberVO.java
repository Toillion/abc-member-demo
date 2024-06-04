package com.example.member.mapper;

import lombok.Data;


// Lombok annotation to generate boilerplate code such as getters, setters,
// toString, equals, and hashCode methods
@Data
public class MemberVO {

   // Field to store the name of the member
   private String name;

   // Field to store the age of the member
   private int age;
}