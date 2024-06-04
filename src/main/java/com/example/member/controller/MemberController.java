package com.example.member.controller;

import com.example.member.mapper.MemberVO;
import com.example.member.model.Member;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotates the class as a REST controller, meaning it will handle HTTP requests and responses
@RestController
// Maps HTTP requests to "/api/members" to methods in this class
@RequestMapping("/api/members")
// Generates a constructor with required arguments (in this case, memberService) using Lombok
@RequiredArgsConstructor
// Adds logging capabilities to the class using Lombok
@Slf4j
public class MemberController
{
   // Declares a final instance of MemberService, which will be automatically injected by Spring
   private final MemberService memberService;

   // Maps HTTP POST requests to "/create" to this method
   @PostMapping("/create")
   // Defines a method to create a new member; takes a MemberVO object from the request body
   public Member createMember( @RequestBody MemberVO memberVO ) {

      log.info( "Start Create Member {}", memberVO );

      // Calls the createMember method of memberService to create and return a new member
      return this.memberService.createMember( memberVO );
   }

}
