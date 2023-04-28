package com.taskAplication.taskManager.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

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

    @Column( name = "marca")
    private String brand;

    @Column( name = "modelo")
    private String model;

    @Column( name = "anio")
    private Integer year;




}
