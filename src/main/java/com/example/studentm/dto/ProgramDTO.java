package com.example.studentm.dto;

import java.util.List;

import com.example.studentm.entity.User;

import lombok.Data;

@Data
public class ProgramDTO {
	 private long id;
	 private String name;
	 private String description;
	 private List<User> users;
	  
}
