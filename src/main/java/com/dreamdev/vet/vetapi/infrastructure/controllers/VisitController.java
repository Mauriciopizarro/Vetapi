package com.dreamdev.vet.vetapi.infrastructure.controllers;

import com.dreamdev.vet.vetapi.application.implementations.VisitImplementation;
import com.dreamdev.vet.vetapi.domain.models.Visit;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/visit")
@RequiredArgsConstructor
public class VisitController {

    private final VisitImplementation visitImplementation;

    @PostMapping("/save")
    public Visit saveVisit(@RequestBody Visit visit){
        visitImplementation.saveTreatment(visit);
        return visit;
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        visitImplementation.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Visit visit){
        saveVisit(visit);
    }

    @GetMapping("/get/{id}")
    public Visit findById(@PathVariable Long id){
        return visitImplementation.findById(id).get();
    }

    @GetMapping("/get/all")
    public List<Visit> findAll(){
        return visitImplementation.findAll();
    }


}
