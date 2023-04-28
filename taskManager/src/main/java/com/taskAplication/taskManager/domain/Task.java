package com.taskAplication.taskManager.domain;

import java.time.LocalDateTime;

public class Task {

    private int taskId;
    private String name;
    private int vehicleId;
    private int customerId;
    private double precio;
    private boolean isDone;
    private LocalDateTime dateOfInnit;
    private LocalDateTime dateOfFinish;

    public LocalDateTime getDateOfInnit() {
        return dateOfInnit;
    }

    public void setDateOfInnit(LocalDateTime dateOfInnit) {
        this.dateOfInnit = dateOfInnit;
    }

    public LocalDateTime getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(LocalDateTime dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

}
