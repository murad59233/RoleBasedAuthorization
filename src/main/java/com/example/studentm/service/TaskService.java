package com.example.studentm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentm.entity.Task;
import com.example.studentm.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	
	public void createTask(Task task, long[] trainees) {
	    Task savedTask = taskRepository.save(task);
//	    long program = savedTask.getProgram();
	   
	  }
}
