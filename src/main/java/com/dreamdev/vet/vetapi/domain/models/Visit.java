package com.dreamdev.vet.vetapi.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Visit")
public class Visit {
    @Id
    private Long id;

    private Long treatmentId;
    private String date;
    private String details;
    private double weightVisit;


    public Visit(Long id, Long treatmentId, String date, String details, double weightVisit) {
        this.id = id;
        this.treatmentId = treatmentId;
        this.date = date;
        this.details = details;
        this.weightVisit = weightVisit;
    }

    public Visit(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(Long treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getWeightVisit() {
        return weightVisit;
    }

    public void setWeightVisit(double weightVisit) {
        this.weightVisit = weightVisit;
    }

}
