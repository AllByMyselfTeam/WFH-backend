package com.app.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Checklist;
import com.app.pojo.Task;
import com.app.service.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {
	@Autowired
	TaskService taskService;
	
	@GetMapping("/{id}")
	public Task getTaskById(@PathVariable("id") int taskId) {
		return taskService.getTaskById(taskId);
	}
	
	@PostMapping
	public Task addTask(@Valid @RequestBody Task task) {
		Date date= new Date();
		task.setBeginDate(date);
		return taskService.addTask(task);
	}
	
	@PutMapping("/{id}")
	public Task updateTask(@Valid @RequestBody Task task) {
		return taskService.updateTask(task);
	}
	
	@GetMapping ("check/{cid}")
	public List<Task> getAllTask(@PathVariable("cid") int cid){
		return taskService.getAllTaskByCheck(cid);
	}
	
	@DeleteMapping("/{taskId}")
	public void deleteTask(@PathVariable("taskId") int taskId) {
		System.out.print(taskId); 
		taskService.deleteTask(taskId);
	}
	
	
}
