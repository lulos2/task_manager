package com.taskAplication.taskManager.persistence.mapper;

import com.taskAplication.taskManager.domain.Vehicle;
import com.taskAplication.taskManager.persistence.entity.EntityVehicle;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
public interface vehicleMapper {

    @Mappings(value = {
            @Mapping(source = "idTask", target = "id"),
            @Mapping(source = "marca", target = "brand"),
            @Mapping(source = "modelo", target = "model"),
            @Mapping(source = "anio", target = "year"),
            @Mapping(source = "entityCustomer", target = "idCustomer"),
    })
    Vehicle toVehicle(EntityVehicle entityVehicle);
    List<Vehicle> toVehicles(List<Vehicle> vehiculos);


}
