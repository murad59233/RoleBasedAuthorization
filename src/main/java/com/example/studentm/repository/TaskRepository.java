package com.example.studentm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentm.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
