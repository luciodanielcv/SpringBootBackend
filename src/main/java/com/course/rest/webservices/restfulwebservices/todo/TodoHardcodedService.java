package com.course.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	
	static {
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to Physics", new Date(), false));
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to Angular", new Date(), false));
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to French", new Date(), false));
		todos.add( new Todo(++idCounter, "in28minutes", "Learn to Cosmos", new Date(), false));
		
	}
	
	public List<Todo> findAll( ){
		return todos;
	}
	
	public Todo deleteById( int id) {
		Todo todo = findById( id );
		todos.remove( todo );
		return todo;
	}
	
	public Todo findById( int id ) {
		for (Todo todo: todos ) {
			if(todo.getId() == id ) {
				return todo;
			}
		}
		return null;
	}
	
	

}
