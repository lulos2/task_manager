package com.taskAplication.taskManager.persistence.mapper;

import com.taskAplication.taskManager.domain.Task;
import com.taskAplication.taskManager.persistence.entity.EntityTask;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mappings({
            @Mapping(source = "idTask",target = "taskId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "entityVehicle",target = "vehicleId"),
            @Mapping(source = "entityCustomer",target = "customerId"),
            @Mapping(source = "price",target = "precio"),
            @Mapping(source = "initDate",target = "dateOfInnit"),
            @Mapping(source = "finishDate",target = "dateOfFinish"),
            @Mapping(source = "isDone",target = "isDone"),
    })
    Task toTask(EntityTask entityTask);
    List<Task> toTasks(List<EntityTask> entityTasks);

    @InheritInverseConfiguration
    EntityTask toEntityTask(Task task);
}
