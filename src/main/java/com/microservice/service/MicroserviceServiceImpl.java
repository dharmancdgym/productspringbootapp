package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.Microservice;
import com.microservice.repository.IMicroserviceRepository;

@Service
public class MicroserviceServiceImpl implements IMicroserviceService {

	@Autowired
	private IMicroserviceRepository microserviceRepository;

	@Override
	public List<Microservice> getAll() {
		return microserviceRepository.getAll();
	}





}
