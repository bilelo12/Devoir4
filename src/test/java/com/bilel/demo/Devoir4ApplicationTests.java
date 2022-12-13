package com.bilel.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bilel.demo.entities.Equipe;
import com.bilel.demo.entities.Joueur;
import com.bilel.demo.repos.*;

@SpringBootTest
class Devoir4ApplicationTests {
	
	@Autowired
	private JoueurRepository JoueurRepository ;

	@Test
	public void testCreateJoueur() {
	Joueur joueuer = new Joueur("salah","10");
	JoueurRepository.save(joueuer);
	}
	
	@Test
	public void testFindJoueur() {
		Joueur j =JoueurRepository.findById(2L).get();
		System.out.print(j);
	}
	
	@Test
	public void testUpdateJoueur()
	{
	Joueur j =JoueurRepository.findById(2L).get();
	j.setNomJoueur("Diego Armando Maradona");
	JoueurRepository.save(j);
	}
	
	@Test
	public void testDeleteJoueur()
	{
	JoueurRepository.deleteById(3L);
	}
	
	@Test
	public void findAllJoueur()
	{
	List<Joueur> joueurs = JoueurRepository.findAll();
			for (Joueur j : joueurs)
			{
			System.out.println(j);
			}
	}
	@Test
	public void findByNomJoueur()
	{
	List<Joueur> joueurs = JoueurRepository.findByNomJoueur("lionel Messi");
			for (Joueur j : joueurs)
			{
			System.out.println(j);
			}
	}
	@Test
	public void findByNomJoueurContains()
	{
	List<Joueur> joueurs = JoueurRepository.findByNomJoueurContains("messi");
			for (Joueur j : joueurs)
			{
			System.out.println(j);
			}
	}
	@Test
	public void testfindByEquipe()
	{
	Equipe eq = new Equipe();
	eq.setIdEquipe(2l);
	List<Joueur> jou = JoueurRepository.findByEquipe(eq);
	for (Joueur j : jou)
	{
	System.out.println(j);
	}
	}
	
	@Test
	public void testfindByEquipeIdEquipe()
	{
	List<Joueur> joueurs = JoueurRepository.findByEquipeIdEquipe(2l);
			for (Joueur j : joueurs)
			{
			System.out.println(j);
			}
	}
	@Test
	public void testfindByOrderNomJoueurAsc()
	{
	List<Joueur> joueurs = JoueurRepository.findByOrderByNomJoueurAsc();
			for (Joueur j : joueurs)
			{
			System.out.println(j);
			}
	}
}
