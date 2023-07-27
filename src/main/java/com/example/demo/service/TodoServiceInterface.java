package com.example.demo.service;

import com.example.demo.entity.Todo;

import java.util.List;

public interface TodoServiceInterface {


    List<Todo> getAllTodos();

    Todo getTodoById(int id);

    Todo saveTodo(Todo todo);

    Todo  updateTodo(int id , Todo todo);

    void deleteTodo(int id);



}
