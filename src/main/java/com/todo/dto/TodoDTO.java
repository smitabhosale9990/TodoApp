package com.todo.dto;

public class TodoDTO {
	
	private Long 	id;
	private String 	name;
	private Boolean isCompleted;
	
	public TodoDTO() {
		super();
	}
	
	public TodoDTO(Long id, String name, Boolean isCompleted) {
		super();
		this.id = id;
		this.name = name;
		this.isCompleted = isCompleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
}