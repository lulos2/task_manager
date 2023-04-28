package com.taskAplication.taskManager.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cliente")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCustomer;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String apellido;

    @ElementCollection
    @CollectionTable( name = "telefono", joinColumns = @JoinColumn(name = "id_cliente") )
    @Column( name = "telefono")
    public List<String> getTelefonos;


    public Customer(Long idCustomer, String name, String apellido) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.apellido = apellido;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

}
