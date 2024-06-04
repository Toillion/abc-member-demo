package com.example.member.service;

import com.example.member.mapper.MemberVO;
import com.example.member.model.Member;
import com.example.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

// Annotates the class as a Spring service component
@Service
// Generates a constructor with required arguments (in this case, memberRepository) using Lombok
@RequiredArgsConstructor
// Adds logging capabilities to the class using Lombok
@Slf4j
public class MemberService
{

   // Declares a final instance of MemberRepository, which will be automatically injected by Spring
   private final MemberRepository memberRepository;

   /**
    * Creates a new member and saves it to the repository.
    *
    * @param memberVO The value object containing member details
    * @return The saved Member entity
    */
   public Member createMember( MemberVO memberVO ) {

      // Creates a new Member entity with a generated UUID
      Member member = new Member( UUID.randomUUID().toString(), memberVO.getName(), memberVO.getAge());

      log.debug( "Saving Member" );

      // Saves the member to the repository and returns the saved entity
      Member savedMember = memberRepository.save(member);

      // Logs the successful saving of the member
      log.info("Member created successfully with ID: {}", savedMember.getId());

      return savedMember;
   }

}
