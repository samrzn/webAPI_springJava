package com.exemploAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemploAPI.domain.Container;
import com.exemploAPI.repositories.ContainerRepository;
import com.exemploAPI.service.exception.ObjectNotFoundException;

@Service
public class ContainerService {

	@Autowired
	ContainerRepository repo;

	public Container findById(Integer id) {
		Optional<Container> container = repo.findById(id);
		return container.orElseThrow(() -> new ObjectNotFoundException(
				"ID: " + id + " Modelo: " + Container.class.getName() + " = Não encontrado"));
	}

	public List<Container> findAll() {
		return repo.findAll();
	}

	public Container save(Container container) {
		container.setId(null);
		return repo.save(container);
	}

	public Container update(Container container) {
		findById(container.getId()); // Se não encontrar, gera exceção...
		return repo.save(container);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
