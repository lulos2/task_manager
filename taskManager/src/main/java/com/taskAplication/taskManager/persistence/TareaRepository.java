package com.taskAplication.taskManager.persistence;

import com.taskAplication.taskManager.domain.Task;
import com.taskAplication.taskManager.domain.repository.TaskRepository;
import com.taskAplication.taskManager.persistence.crud.TaskCrudRepository;
import com.taskAplication.taskManager.persistence.entity.EntityTask;
import com.taskAplication.taskManager.persistence.mapper.TaskMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TareaRepository implements TaskRepository {

    private TaskCrudRepository taskCrudRepository;
    private TaskMapper mapper;
    @Override
    public List<Task> getAll() {
        List<EntityTask> tasks = (List<EntityTask>) taskCrudRepository.findAll();
        return mapper.toTasks(tasks);
    }

    @Override
    public Optional<List<Task>> getByIdCustomer(int idCustomer) {
        List<EntityTask> tasks = taskCrudRepository.findByCustomer(idCustomer);
        return Optional.of(mapper.toTasks(tasks));
    }

    @Override
    public Optional<List<Task>> getByVehicle(int idVehicle) {
        List<EntityTask> tasks = taskCrudRepository.findByVehicle(idVehicle);
        return Optional.of(mapper.toTasks(tasks));
    }

    @Override
    public Optional<Task> getTask(long idTask) {
        return taskCrudRepository.findById(idTask).map(entityTask -> mapper.toTask(entityTask));
    }

    @Override
    public void delete(long idTask) {
        taskCrudRepository.deleteById(idTask);
    }

    @Override
    public Task save(Task task) {
        EntityTask entityTask = mapper.toEntityTask(task);
        return mapper.toTask(taskCrudRepository.save(entityTask));
    }




}
