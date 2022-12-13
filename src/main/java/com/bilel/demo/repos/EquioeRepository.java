package com.bilel.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bilel.demo.entities.Equipe;

@RepositoryRestResource(path = "equ")
@CrossOrigin(origins = "http://localhost:4200/") 
public interface EquioeRepository extends JpaRepository<Equipe, Long> {

}
