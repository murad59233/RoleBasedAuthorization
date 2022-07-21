package com.example.studentm.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentm.dto.NewTaskDTO;
import com.example.studentm.dto.TaskDTO;
import com.example.studentm.entity.Task;
import com.example.studentm.repository.TaskRepository;
import com.example.studentm.service.TaskService;

@RestController

@RequestMapping(path="/tasks")
@CrossOrigin(origins= "*")
public class TaskController {
	
	  
	 @Autowired
	 private TaskService taskService;
	 
	 @Autowired
	 private TaskRepository taskRepository;
	 
	 @PostMapping("/createTask")
	  public ResponseEntity<Boolean> createTask(@RequestBody TaskDTO taskDTO) {
		Task task = new Task();
		task.setContent(taskDTO.getContent());
		task.setProgram(taskDTO.getProgram());
		task.setStatus(taskDTO.getStatus());
		task.setDateCreated(taskDTO.getDateCreated());
		
		
//		BeanUtils.copyProperties(newTaskDTO.getTask(), task);
		
	taskRepository.save(task);
//	    taskService.createTask(task, newTaskDTO.getUser());
	    return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	  }
	 @GetMapping("/createTask")
	  public List<Task> getTask() {
	 
		 return taskRepository.findAll();
	 }
}
