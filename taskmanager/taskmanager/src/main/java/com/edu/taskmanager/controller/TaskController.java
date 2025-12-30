package com.edu.taskmanager.controller;

import com.edu.taskmanager.model.Task;
import com.edu.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // POST /TASKS
    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.create(task);
    }

}
