package com.dreamdev.vet.vetapi.infrastructure.repositories;
import com.dreamdev.vet.vetapi.domain.models.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends MongoRepository<Pet, Long> {

}
