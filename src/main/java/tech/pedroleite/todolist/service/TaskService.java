package tech.pedroleite.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.pedroleite.todolist.entity.Task;
import tech.pedroleite.todolist.repository.TaskRepository;

import java.util.List;
import java.util.Optional;


@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task create(Task task) {
        return repository.save(task);
    }

    public List<Task> listAll() {
        return repository.findAll();
    }

    public Task findById(Long id) {
        var task = repository.findById(id);
        return task.orElse(null);
    }

    public Task update(Task task) {
        return repository.save(task);
    }

    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
