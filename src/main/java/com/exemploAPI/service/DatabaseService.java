package com.exemploAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemploAPI.domain.Container;
import com.exemploAPI.repositories.ContainerRepository;

@Service
public class DatabaseService {

	@Autowired
	private ContainerRepository repo;

	public void startDatabase() {
		Container container = new Container(null, "Graneleiro", "Azul", 37, 13100.00);
		repo.save(container);
	}

}
