package com.dreamdev.vet.vetapi.infrastructure.controllers;

import com.dreamdev.vet.vetapi.application.implementations.TreatmentImplementation;
import com.dreamdev.vet.vetapi.domain.models.Treatment;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/treatment")
@RequiredArgsConstructor
public class TreatmentController {

    private final TreatmentImplementation treatmentImplementation;

    @PostMapping("/save")
    public Treatment saveTreatment(@RequestBody Treatment treatment){
        treatmentImplementation.saveTreatment(treatment);
        return treatment;
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        treatmentImplementation.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Treatment treatment){
        saveTreatment(treatment);
    }

    @GetMapping("/get/{id}")
    public Treatment findById(@PathVariable Long id){
        return treatmentImplementation.findById(id).get();
    }

    @GetMapping("/get/all")
    public List<Treatment> findAll(){
        return treatmentImplementation.findAll();
    }

}
