package com.dreamdev.vet.vetapi.infrastructure.repositories;

import com.dreamdev.vet.vetapi.domain.models.Treatment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepository extends MongoRepository<Treatment, Long> {

}
