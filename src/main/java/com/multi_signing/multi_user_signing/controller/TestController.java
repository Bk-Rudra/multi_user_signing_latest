package com.multi_signing.multi_user_signing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi_signing.multi_user_signing.payload.Response.MessageResponse;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/Initiator")
//	@PreAuthorize("hasRole('Initiator') or hasRole('Invitee') or hasRole('Invited')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/Invitee")
//	@PreAuthorize("hasRole('Invitee')")
	public String moderatorAccess() {
		return "Invitee Board.";
	}

	@GetMapping("/Invited")
//	@PreAuthorize("hasRole('Invited')")
	public String adminAccess() {
		return "Invited Board.";
	}
	public ResponseEntity<?> handle() {
//        return new ResponseEntity<Object>(HttpStatus.OK);
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}