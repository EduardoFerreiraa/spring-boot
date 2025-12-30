package com.edu.simpletasks.controller;

import com.edu.simpletasks.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/hello")
    public String olaMundo() {
        return "API FUNCIONANDO!";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(1L, "Estudar Spring Boot", false));
        tasks.add(new Task(2L, "Aprender API REST", true));

        return tasks;
    }
}
