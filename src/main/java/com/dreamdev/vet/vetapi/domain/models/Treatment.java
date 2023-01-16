package com.dreamdev.vet.vetapi.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Treatment")
public class Treatment {

    @Id
    private Long id;

    private Long petId;
    private String typeTreatment;
    private String description;
    private double cost;
    private String status;


    public Treatment(Long id, Long petId, String typeTreatment, String description, double cost, String status) {
        this.id = id;
        this.petId = petId;
        this.typeTreatment = typeTreatment;
        this.description = description;
        this.cost = cost;
        this.status = status;
    }

    public Treatment(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getTypeTreatment() {
        return typeTreatment;
    }

    public void setTypeTreatment(String typeTreatment) {
        this.typeTreatment = typeTreatment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
