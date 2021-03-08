package com.todo.service;

import com.todo.dto.TodoDTO;

public interface TodoService {
	
	public TodoDTO getTask(Long id);
	
	public void addTask(TodoDTO dto);
}
