package com.example.demo.controller;
import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TodoController {
    TodoService todoService;

    @GetMapping(path = "/")
    List<Todo> allTodos(){
        return this.todoService.getAllTodos();
    }

    @GetMapping("/lab-jenkins")
    public String labInfo() {
        return "hello from jenkins lab ";
    }
    @GetMapping(path = "/{id}")
    Todo allOneTodo(@PathVariable(name = "id") int id){
        return this.todoService.getTodoById(id);
    }


    @PostMapping(path = "/save")
    Todo saveAtodo(@RequestBody Todo todo){
        return this.todoService.saveTodo(todo);
    }

    @PutMapping("/update/{id}")
    Todo updateAtodo(@PathVariable(name = "id") int id,@RequestBody Todo todo){
       return this.todoService.updateTodo(id,todo);
    }

    @DeleteMapping(path = "/delete/{id}")
    void deleteAtodo(@PathVariable(name = "id") int id){
        this.todoService.deleteTodo(id);
    }
}
