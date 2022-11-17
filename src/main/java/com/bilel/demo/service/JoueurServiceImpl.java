package com.bilel.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilel.demo.repos.*;
import com.bilel.demo.entities.Equipe;
import com.bilel.demo.entities.Joueur;

@Service
public class JoueurServiceImpl implements JoueurService {
	
	@Autowired
	JoueurRepository JoueurRepository ;
	@Override
	public Joueur saveJoueur(Joueur j) {
		
		return JoueurRepository.save(j);
	}

	@Override
	public Joueur updateJoueur(Joueur j) {
		// TODO Auto-generated method stub
		return JoueurRepository.save(j);
	}

	@Override
	public void deleteJoueur(Joueur j) {
		// TODO Auto-generated method stub
		JoueurRepository.delete(j);
	}

	@Override
	public void deleteJoueurById(Long id) {
		// TODO Auto-generated method stub
		JoueurRepository.deleteById(id);
	}

	@Override
	public Joueur getJoueur(Long id) {
		// TODO Auto-generated method stub
		return JoueurRepository.findById(id).get();
	}

	@Override
	public List<Joueur> findAllJoueur() {
		// TODO Auto-generated method stub
		return JoueurRepository.findAll();
	}

	@Override
	public List<Joueur> findByNomJoueur(String nom) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByNomJoueurContains(nom);
	}

	@Override
	public List<Joueur> findByNomJoueurContains(String nom) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByNomJoueurContains(nom);
	}

	@Override
	public List<Joueur> findByEquipe(Equipe Equipe) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByEquipe(Equipe);
	}

	@Override
	public List<Joueur> findByEquipeIdEquipe(long id) {
		// TODO Auto-generated method stub
		return JoueurRepository.findByEquipeIdEquipe(id);
	}

	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
		// TODO Auto-generated method stub
		return JoueurRepository.findByOrderByNomJoueurAsc();
	}

}
