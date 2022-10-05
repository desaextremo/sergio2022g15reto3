package com.g15.jpa.controller;

import com.g15.jpa.entity.Client;
import com.g15.jpa.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    private ClientService ClientService;
    
    @GetMapping("/all")
    public List<Client> getCategoryList(){
        return ClientService.getClientList();
    }
}