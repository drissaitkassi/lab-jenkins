package com.example.demo.repositories;

import com.example.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepositories extends JpaRepository<Todo,Integer> {

}
