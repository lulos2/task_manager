package com.taskAplication.taskManager.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table (name = "tarea")
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_tarea")
    private Long idTask;

    @Column( name = "nombre")
    private String taskName;

    @ManyToOne
    @JoinColumn( name = "idVehicle", insertable = false, updatable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn( name = "idCustomer", insertable = false, updatable = false)
    private Customer customer;

    @Column( name = "precio")
    private Integer price;

    @Column( name = "fecha_inicio")
    private LocalDateTime initDate;

    @Column( name = "is_done")
    private boolean isDone;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setInitDate(LocalDateTime initDate) {
        this.initDate = initDate;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Long getIdTask() {
        return idTask;
    }

    public Integer getPrice() {
        return price;
    }

    public LocalDateTime getInitDate() {
        return initDate;
    }

    public boolean isDone() {
        return isDone;
    }
}
