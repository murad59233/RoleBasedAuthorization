package com.example.studentm;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.studentm.entity.User;


public interface UserRepository extends JpaRepository<User,Long>{

	User findByUsername(String username);

	Optional<User> findById(String username);
	
	
	
//	@Query("SELECT u from User u Where u.username= :username")
//	public User getUserByUsername(@Param("username") String username);
	
}
