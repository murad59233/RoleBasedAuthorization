package com.example.studentm.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentm.UserRepository;
import com.example.studentm.entity.User;



@RestController

@RequestMapping(path="/users")
@CrossOrigin(origins= "*")
public class UserController {

	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	
	@PostMapping(path = "/teacher")
	public ResponseEntity<Void> saveTeacher(@RequestBody User user) {
//		Optional<User> user1 = userRepository.findById(user.getUsername());
//
//		if(user1 == null) {
//			throw new UsernameNotFoundException("Could not find user ");
//		}
		userRepository.save(user);
			org.springframework.http.HttpHeaders header = new org.springframework.http.HttpHeaders();
			header.add("desc", "Adding one teacher");
			
		return ResponseEntity.status(HttpStatus.OK).headers(header).build();
	}
	@GetMapping(path = "/teacher")
	public List<User> getasda() {
	
		return userRepository.findAll();
	}
}
