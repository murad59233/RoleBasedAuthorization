package com.example.studentm.dto;

import com.example.studentm.entity.Task;

import lombok.Data;

@Data

public class NewTaskDTO {

	private TaskDTO task;
	
	private long[] user;
	
}
