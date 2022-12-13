package com.bilel.demo.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bilel.demo.entities.Joueur;

import com.bilel.demo.service.JoueurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class JoueurRestController {
	
	@Autowired
	JoueurService joueurService ;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	public List<Joueur> getAllProduits() {
		return joueurService.findAllJoueur();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Joueur getJoueurById(@PathVariable("id") Long id) {
		return joueurService.getJoueur(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Joueur createJoueur( @RequestBody Joueur joueur) {
		return joueurService.saveJoueur(joueur); 
		
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Joueur updateJoueur( @RequestBody Joueur joueur) {
		return joueurService.updateJoueur(joueur);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void DeleteJoueur(@PathVariable("id") Long id) {
		 joueurService.deleteJoueurById(id);
	}
	// @RequestParam(value = "requestMessage")
	@RequestMapping(value="/Equipe/{idEquipe}",method=RequestMethod.GET)
	public List<Joueur> getJoueurByIdEquipe( @PathVariable("idEquipe") Long id) {
		return joueurService.findByEquipeIdEquipe(id);
		
	}
	
	@RequestMapping(value="/JoueurByName/{nom}",method = RequestMethod.GET)
	public List<Joueur> findByNomJoueurContains(@PathVariable("nom") String nom) {
	return joueurService.findByNomJoueurContains(nom);
	}

}
