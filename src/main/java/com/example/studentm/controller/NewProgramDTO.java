package com.example.studentm.controller;

import lombok.Data;

@Data
public class NewProgramDTO {
	private long id;
	  private String name;
	  private String description;
	  private long[] users;
	}
