package com.taskAplication.taskManager.persistence.crud;

import com.taskAplication.taskManager.persistence.entity.EntityCustomer;
import com.taskAplication.taskManager.persistence.entity.EntityTask;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskCrudRepository extends CrudRepository<EntityTask, Long> {
    List<EntityTask> findByCustomer(int entityCustomerId);
    List<EntityTask> findByVehicle(int entityVehicleId);
}
