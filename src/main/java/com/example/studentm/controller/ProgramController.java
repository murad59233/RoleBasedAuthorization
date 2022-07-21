package com.example.studentm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentm.service.ProgramService;

@RestController
@CrossOrigin(origins= "*")
public class ProgramController {

	
	@Autowired
	private ProgramService programService;
	
	  @PostMapping("/createProgram/{uid}")
	  public ResponseEntity<Boolean> createProgram( @PathVariable("uid") Long uid,@RequestBody NewProgramDTO newProgramDto) {
	    programService.createProgram(newProgramDto,uid);
	    return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	  }
	
	
}
