package com.example.member.repository;

import com.example.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// MemberRepository is an interface for managing Member entities
// Extends JpaRepository to provide CRUD operations and more for Member entities
public interface MemberRepository extends JpaRepository<Member, String>
{
   // JpaRepository<Member, String> indicates the type of the entity (Member)
   // and the type of the entity's ID (String)
}
