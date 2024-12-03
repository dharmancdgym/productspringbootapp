package com.microservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.microservice.model.Microservice;
import com.microservice.repository.IMicroserviceRepository;

@RestController
public class MicroserviceController {

    @Autowired
    private IMicroserviceRepository microserviceRepository;



    @GetMapping("/showmicroservice")
    public List<Microservice> getAllMicroservices() throws Exception {
        return microserviceRepository.getAll();
    }
}
