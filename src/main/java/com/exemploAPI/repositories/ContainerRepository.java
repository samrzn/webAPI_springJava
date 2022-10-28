package com.exemploAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemploAPI.domain.Container;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Integer> {

}
