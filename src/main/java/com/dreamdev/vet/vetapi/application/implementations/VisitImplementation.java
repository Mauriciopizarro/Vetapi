package com.dreamdev.vet.vetapi.application.implementations;

import com.dreamdev.vet.vetapi.domain.models.Visit;
import com.dreamdev.vet.vetapi.infrastructure.repositories.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VisitImplementation {

    private final VisitRepository visitRepository;

    public Optional<Visit> findById(Long id){
        return visitRepository.findById(id);
    }

    public void saveTreatment(Visit visit){
        visitRepository.save(visit);
    }

    public List<Visit> findAll(){
        return visitRepository.findAll();
    }

    public void deleteById(Long id){
        visitRepository.deleteById(id);
    }

}
