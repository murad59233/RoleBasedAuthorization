package com.example.studentm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Program {
	  
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
	  
		private String name;
	  
		@Column(length = 65450, columnDefinition = "text")
		private String description;
	
		@ManyToMany
		@JsonManagedReference
		private List<User> users;
		
		
		  private long admin;

}
