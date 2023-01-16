package com.dreamdev.vet.vetapi.application.implementations;
import com.dreamdev.vet.vetapi.domain.models.Pet;
import com.dreamdev.vet.vetapi.infrastructure.repositories.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PetImplementation {

    private final PetRepository petRepository;

    public void savePet(Pet pet){
        petRepository.save(pet);
    }

    public void updatePet(Pet pet){
        savePet(pet);
    }

    public Optional<Pet> getById(Long id){
        return petRepository.findById(id);
    }

    public List<Pet> findAll(){
        return petRepository.findAll();
    }

    public void deleteById(Long id){
        petRepository.deleteById(id);
    }


}
