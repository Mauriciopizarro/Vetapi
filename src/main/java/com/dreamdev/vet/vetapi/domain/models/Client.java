package com.dreamdev.vet.vetapi.domain.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Client")
public class Client {
    
    @Id
    private Long id;

    private int identification;
    private String name;
    private String lastName;
    private long phoneNumber;
    private String email;


    public Client(Long id, int identification, String name, String lastName, long phoneNumber, String email) {
        this.id = id;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Client (){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){this.email = email;}

    public String getEmail(){
        return email;
    }
}
