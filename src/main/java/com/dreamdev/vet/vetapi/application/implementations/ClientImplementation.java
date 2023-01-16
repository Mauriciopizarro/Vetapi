package com.dreamdev.vet.vetapi.application.implementations;
import com.dreamdev.vet.vetapi.domain.models.Client;
import com.dreamdev.vet.vetapi.infrastructure.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientImplementation {

    private final ClientRepository clientRepo;

    public Client saveClient(Client client){
        return clientRepo.save(client);
    }
    public List<Client> getByIdentification(int identification){
        return clientRepo.getClientByIdentification(identification);
    }

    public List<Client> getClientByPhoneNumber(Long phoneNumber){
        return clientRepo.getClientByPhoneNumber(phoneNumber);
    }

    public List<Client> findAll(){
        return clientRepo.findAll();
    }

    public Optional<Client> findById(Long id){
        return clientRepo.findById(id);
    }

    public void deleteById(Long id){
        clientRepo.deleteById(id);
    }

}
