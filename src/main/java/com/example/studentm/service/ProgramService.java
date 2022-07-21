package com.example.studentm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentm.UserRepository;
import com.example.studentm.controller.NewProgramDTO;
import com.example.studentm.entity.Program;
@Service
public class ProgramService {

	@Autowired
	private UserRepository userRepository;
	
	public void createProgram(NewProgramDTO newProgramDto,long admin) {
	Program program  = new Program();
	
	program.setId(newProgramDto.getId());
	program.setName(newProgramDto.getName());
	program.setDescription(newProgramDto.getDescription());
	program.setAdmin(admin);
	User user =userRepository.findById(admin).get();
	
		
	}

}
