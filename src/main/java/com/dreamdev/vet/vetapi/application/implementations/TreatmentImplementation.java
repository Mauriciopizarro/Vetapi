package com.dreamdev.vet.vetapi.application.implementations;

import com.dreamdev.vet.vetapi.domain.models.Treatment;
import com.dreamdev.vet.vetapi.infrastructure.repositories.TreatmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TreatmentImplementation {

    private final TreatmentRepository treatmentRepository;

    public Optional<Treatment> findById(Long id){
        return treatmentRepository.findById(id);
    }

    public void saveTreatment(Treatment treatment){
        treatmentRepository.save(treatment);
    }

    public List<Treatment> findAll(){
        return treatmentRepository.findAll();
    }

    public void deleteById(Long id){
        treatmentRepository.deleteById(id);
    }


}
