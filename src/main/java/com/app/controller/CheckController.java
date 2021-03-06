package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.app.service.CheckService;

@RestController
@RequestMapping("/checklist")
@CrossOrigin(origins = "http://localhost:4200")
public class CheckController {
	@Autowired
	CheckService checkService;
	
//	@GetMapping("/{id}")
//	public Checklist getChecklistById(@PathVariable("id") int checkId) {
//		return checkService.getCheckListById(checkId);
//	}
	
	@PostMapping
	public Checklist addChecklist (@Valid @RequestBody Checklist check){
		return checkService.addNewChecklist(check);
	}
	
	@PutMapping("/{id}")
	public Checklist updateChecklist(@Valid @RequestBody Checklist check) {
		return checkService.updateChecklist(check);
	}
	
	@GetMapping("user/{id}")
	public List<Checklist> getAllChecklistById(@PathVariable("id") int userId){
		return checkService.findAllById(userId);
	}
	
	@DeleteMapping("{checkId}")
	public void deleteChecklist(@PathVariable("checkId") int checkId)
	{
		checkService.deleteChecklistById(checkId);
	}
	
}
