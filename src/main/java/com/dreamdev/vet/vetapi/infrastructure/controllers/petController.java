package com.dreamdev.vet.vetapi.infrastructure.controllers;

import com.dreamdev.vet.vetapi.application.implementations.PetImplementation;
import com.dreamdev.vet.vetapi.domain.models.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pet")
@RequiredArgsConstructor
public class petController {

    public final PetImplementation petImplementation;

    @PostMapping("/save")
    public void savePet(@RequestBody Pet pet){
        petImplementation.savePet(pet);
    }

    @GetMapping("/get/all")
    public List<Pet> getAllPets(){
        return petImplementation.findAll();
    }

    @GetMapping("/get/{id}")
    public Pet getById(@PathVariable Long id){
        return petImplementation.getById(id).get();
    }

    @PutMapping("/update")
    public void update(@RequestBody Pet pet){
        savePet(pet);
    }


}
