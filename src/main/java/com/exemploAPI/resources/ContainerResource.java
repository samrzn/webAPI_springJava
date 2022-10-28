package com.exemploAPI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemploAPI.domain.Container;
import com.exemploAPI.service.ContainerService;

@RestController
@RequestMapping("/containers")
@CrossOrigin("*")
public class ContainerResource {

	@Autowired
	private ContainerService service;

	@GetMapping("{id}")
	public ResponseEntity<Container> findById(@PathVariable("id") Integer id) {
		Container container = service.findById(id);
		return ResponseEntity.ok().body(container);
	}

	@GetMapping
	public ResponseEntity<List<Container>> findAll() {
		List<Container> containers = service.findAll();
		return ResponseEntity.ok().body(containers);
	}

	@PostMapping
	public ResponseEntity<Container> save(@RequestBody Container container) {
		Container obj = service.save(container);
		return ResponseEntity.ok().body(obj);
	}

	@PutMapping
	public ResponseEntity<Container> update(@RequestBody Container container) {
		Container obj = service.update(container);
		return ResponseEntity.ok().body(obj);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
