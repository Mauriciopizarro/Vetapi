package com.dreamdev.vet.vetapi.infrastructure.repositories;
import com.dreamdev.vet.vetapi.domain.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public interface ClientRepository extends MongoRepository<Client, Long> {

    @Query("{identification :?0}")
    public List<Client> getClientByIdentification(int identification);

    @Query("{phoneNumber :?0}")
    public List<Client> getClientByPhoneNumber(Long phoneNumber);

}