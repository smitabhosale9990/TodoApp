package com.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.dto.TodoDTO;
import com.todo.pojo.Todo;
import com.todo.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService{

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public TodoDTO getTask(Long id) {
		Todo todo = todoRepository.getOne(id);
		TodoDTO dto = new TodoDTO(todo.getId(), todo.getName(), todo.getIsCompleted());
		return dto;
	}

	@Override
	public void addTask(TodoDTO dto) {
		Todo todo = new Todo(null, dto.getName(), dto.getIsCompleted());
		todoRepository.save(todo);
	}
}