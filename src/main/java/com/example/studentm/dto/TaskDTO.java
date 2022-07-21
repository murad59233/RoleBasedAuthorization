package com.example.studentm.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Data
public class TaskDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private Long program;
	
	private String content;
	
	
	private String status;
	
 
	@JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
	 @Column(name = "date_created")
	  private String dateCreated;
}
