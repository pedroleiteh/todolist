package tech.pedroleite.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.pedroleite.todolist.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
