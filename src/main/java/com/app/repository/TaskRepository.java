package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {

}