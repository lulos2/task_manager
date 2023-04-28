package com.taskAplication.taskManager.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "tarea")
public class EntityTask {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id_tarea")
    private Long idTask;

    @Column( name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn( name = "idVehicle", insertable = false, updatable = false)
    private EntityVehicle entityVehicle;

    @ManyToOne
    @JoinColumn( name = "idCustomer", insertable = false, updatable = false)
    private EntityCustomer entityCustomer;

    @Column( name = "precio")
    private Integer price;

    @Column( name = "fecha_inicio")
    private LocalDateTime initDate;

    @Column( name = "fecha_fin")
    private LocalDateTime finishDate;

    @Column( name = "is_done")
    private boolean isDone;

    public EntityVehicle getVehicle() {
        return entityVehicle;
    }

    public EntityCustomer getCustomer() {
        return entityCustomer;
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
