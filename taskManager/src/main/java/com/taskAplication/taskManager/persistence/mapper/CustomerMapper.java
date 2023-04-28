package com.taskAplication.taskManager.persistence.mapper;

import com.taskAplication.taskManager.domain.Customer;
import com.taskAplication.taskManager.persistence.entity.EntityCustomer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "idCliente", target = "customerId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "surname"),
    })
    Customer toCustomer(EntityCustomer entityCustomer);

    @InheritInverseConfiguration
    EntityCustomer toEntityCustomer(Customer customer);
}
