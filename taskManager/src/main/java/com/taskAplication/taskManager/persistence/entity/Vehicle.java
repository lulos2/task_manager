package com.taskAplication.taskManager.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table( name = "vehiculo")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCustomer", insertable = false, updatable = false)
    private Customer customer;


}
