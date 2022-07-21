package com.example.studentm.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String username;
	
	private String password;

	private boolean enabled;


	  @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	  @JoinTable(name="users_roles",joinColumns =@JoinColumn (name="user_id"),inverseJoinColumns = @JoinColumn (name="role_id"))
	private Set<Role> roles= new HashSet<>();
	  
	  @ManyToMany(mappedBy = "users")
	    @JsonManagedReference
	    private List<Program> program = new ArrayList<>();
	
}
