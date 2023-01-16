package com.dreamdev.vet.vetapi.infrastructure.controllers;
import com.dreamdev.vet.vetapi.application.implementations.ClientImplementation;
import com.dreamdev.vet.vetapi.domain.models.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/client")
@RequiredArgsConstructor
public class clientController {

    private final ClientImplementation clientImplementation;

    @PostMapping("/save")
    public Client saveClient(@RequestBody Client client){
        return clientImplementation.saveClient(client);
    }

    @GetMapping("/get/identification/{identification}")
    public List<Client> getByIdentification(@PathVariable int identification){
        return clientImplementation.getByIdentification(identification);
    }

    @GetMapping("/get/phone/{phoneNumber}")
    public List<Client> getClientByPhoneNumber(@PathVariable Long phoneNumber){
        return clientImplementation.getClientByPhoneNumber(phoneNumber);
    }

    @GetMapping("/get/all")
    public List<Client> findAll(){
        return clientImplementation.findAll();
    }

    @GetMapping("/get/{id}")
    public Client findById(@PathVariable Long id){
        return clientImplementation.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        clientImplementation.deleteById(id);
    }

    @PutMapping("/update")
    public void updateClient(@RequestBody Client client){
        clientImplementation.saveClient(client);
    }

}
