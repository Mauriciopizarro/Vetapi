package com.dreamdev.vet.vetapi.infrastructure.repositories;

import com.dreamdev.vet.vetapi.domain.models.Visit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends MongoRepository<Visit, Long> {
}
