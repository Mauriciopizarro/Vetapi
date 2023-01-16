package com.dreamdev.vet.vetapi.domain.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "Pet")
public class Pet {

    @Id
    private Long id;

    private Long clientId;
    private String kind;
    private String alias;
    private String gender;
    private String race;
    private String hairColor;
    private String dateBirth;
    private double weightAverage;


    public Pet(Long id, Long clientId, String kind, String alias, String gender, String race, String hairColor, String dateBirth, double weightAverage) {
        this.id = id;
        this.clientId = clientId;
        this.kind = kind;
        this.alias = alias;
        this.gender = gender;
        this.race = race;
        this.hairColor = hairColor;
        this.dateBirth = dateBirth;
        this.weightAverage = weightAverage;
    }

    public Pet(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public double getWeightAverage() {
        return weightAverage;
    }

    public void setWeightAverage(double weightAverage) {
        this.weightAverage = weightAverage;
    }
}
