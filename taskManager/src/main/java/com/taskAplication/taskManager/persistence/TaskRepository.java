package com.taskAplication.taskManager.domain.repository;

import com.taskAplication.taskManager.persistence.crud.TaskCrudRepository;
import com.taskAplication.taskManager.persistence.entity.Task;

import java.util.List;

public class TaskRepository {
    private TaskCrudRepository taskCrudRepository;

    public List<Task> getAll() {
        return (List<Task>) taskCrudRepository.findAll();
    }

    public void delete(Task task) {
        taskCrudRepository.delete(task);
    }


}
