package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.todo.dto.TodoDTO;
import com.todo.service.TodoService;

@RestController
@RequestMapping("/app")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todo/{id}")
	public TodoDTO getTask(@PathVariable(value="id")Long taskId) {
		return todoService.getTask(taskId);
	}
	
	@PostMapping("/todo")
	public void addTask(@RequestBody TodoDTO todoDTO) {
		todoService.addTask(todoDTO);
	}
}