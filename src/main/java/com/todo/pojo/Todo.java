package com.todo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Todo {
	
	private Long 	id;
	private String 	name;
	private Boolean isCompleted;
	
	public Todo() {
		super();
	}
	
	public Todo(Long id, String name, Boolean isCompleted) {
		super();
		this.id = id;
		this.name = name;
		this.isCompleted = isCompleted;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable = false)
	public Long getId() {
		return id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	@Column(name = "is_completed")
	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
}