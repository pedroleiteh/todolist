package tech.pedroleite.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import tech.pedroleite.todolist.entity.Task;
import tech.pedroleite.todolist.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @PostMapping
    @Transactional
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        var taskSaved = service.create(task);

        var uri = UriComponentsBuilder.fromPath("http://localhost:8080/tasks/{id}").buildAndExpand(taskSaved.getId()).toUri();

        return ResponseEntity.created(uri).body(task);
    }

    @GetMapping
    public ResponseEntity<List<Task>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

}
