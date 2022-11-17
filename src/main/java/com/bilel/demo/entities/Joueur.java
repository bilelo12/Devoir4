package com.bilel.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Joueur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String nomJoueur ;
	
	@ManyToOne
	private Equipe equipe;
	
	public Joueur() {
		super();
	}
	public Joueur(String nomJoueur) {
		this.nomJoueur=nomJoueur;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomJoueur() {
		return nomJoueur;
	}
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nomJoueur=" + nomJoueur + "]";
	}
}
