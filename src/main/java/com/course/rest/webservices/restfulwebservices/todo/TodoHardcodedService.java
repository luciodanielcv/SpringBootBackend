package com.course.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter = 0;
	
	static {
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to Physics", new Date(), false));
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to Angular", new Date(), false));
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to French", new Date(), false));
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to Cosmos", new Date(), false));
		
	}
	
	public List<Todo> findAll( ){
		return todos;
	}
	
	public Todo deleteById( Long id) {
		Todo todo = findById( id );
		todos.remove( todo );
		return todo;
	}
	
	public Todo findById( Long id ) {
		for (Todo todo: todos ) {
			if(todo.getId() == id ) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	

}
