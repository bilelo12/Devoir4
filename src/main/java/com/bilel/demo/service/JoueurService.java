package com.bilel.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.bilel.demo.entities.Equipe;
import com.bilel.demo.entities.Joueur;

public interface JoueurService {
	
	Joueur saveJoueur(Joueur j);
	Joueur  updateJoueur(Joueur j);
	void deleteJoueur(Joueur j);
	 void deleteJoueurById(Long id);
	Joueur getJoueur(Long id);
	List<Joueur > findAllJoueur();
	
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur>  findByNomJoueurContains(String nom);
	List<Joueur> findByEquipe(Equipe Equipe);
	List<Joueur> findByEquipeIdEquipe(long id);
	List<Joueur> findByOrderByNomJoueurAsc();

}
