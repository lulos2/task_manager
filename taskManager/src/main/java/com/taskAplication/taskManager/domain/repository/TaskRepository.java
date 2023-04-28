package com.taskAplication.taskManager.domain.repository;

import com.taskAplication.taskManager.domain.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> getAll();
    Optional<List<Task>> getByIdCustomer(int idCustomer);
    Optional<List<Task>> getByVehicle(int idVehicle);
    Optional<Task> getTask(long idTask);
    void delete(long idTask);
    Task save(Task task);


}
