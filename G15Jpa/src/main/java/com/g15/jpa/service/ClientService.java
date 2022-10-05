package com.g15.jpa.service;

import com.g15.jpa.entity.Client;
import com.g15.jpa.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getClientList(){
        return clientRepository.findAll();
    }
}
