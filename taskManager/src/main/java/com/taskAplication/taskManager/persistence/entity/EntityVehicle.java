package com.taskAplication.taskManager.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table( name = "vehiculo")
public class EntityVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idCustomer", insertable = false, updatable = false)
    private EntityCustomer entityCustomer;

    @Column( name = "marca")
    private String marca;

    @Column( name = "modelo")
    private String modelo;

    @Column( name = "anio")
    private Integer anio;

    public Long getId() {
        return id;
    }

    public EntityCustomer getEntityCustomer() {
        return entityCustomer;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }
}
