package com.bilel.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bilel.demo.entities.*;

@RepositoryRestResource(path = "rest")
@CrossOrigin(origins = "http://localhost:4200/") 
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur>  findByNomJoueurContains(String nom);
	@Query("select j from Joueur j where j.equipe = ?1")
	List<Joueur> findByEquipe(Equipe Equipe);
	List<Joueur> findByEquipeIdEquipe(long id);
	List<Joueur> findByOrderByNomJoueurAsc();
	

}
