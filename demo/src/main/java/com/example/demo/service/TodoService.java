package com.example.demo.service;

import com.example.demo.entity.Todo;
import com.example.demo.repositories.TodoRepositories;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor @NoArgsConstructor
public class TodoService implements TodoServiceInterface {
    @Autowired
    TodoRepositories todoRepositories ;

    @Override
    public List<Todo> getAllTodos() {

        return this.todoRepositories.findAll();

    }

    @Override
    public Todo getTodoById(int id) {
        return this.todoRepositories.findById(id).get();

    }

    @Override
    public Todo saveTodo(Todo todo) {

       return this.todoRepositories.save(todo);
    }

    @Override
    public Todo updateTodo(int id, Todo todo) {

        Todo customerToBeUpdated =getTodoById(id);

        customerToBeUpdated.setStatus(todo.getStatus());
        customerToBeUpdated.setDescription(todo.getDescription());
        customerToBeUpdated.setUserName(todo.getUserName());

        return this.todoRepositories.save(customerToBeUpdated);
    }

    @Override
    public void deleteTodo(int id) {
        this.todoRepositories.deleteById(id);
    }
}
