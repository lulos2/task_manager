package com.taskAplication.taskManager.domain.repository;

import com.taskAplication.taskManager.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    List<Customer> getAll();
    Optional<List<Customer>> getByTask(int taskId);
    Optional<List<Customer>> getByOwned(double owed);

    Customer save(Customer customer);
    void delete(int customerId);

}
