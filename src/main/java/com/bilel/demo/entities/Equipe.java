package com.bilel.demo.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEquipe ;
	private String nomEquipe ;
	
	
	@OneToMany(mappedBy = "equipe")
	@JsonIgnore
	private List<Joueur> joueurs;
	
	public Equipe() {
		
	}
	public Equipe(String nom) {
		this.nomEquipe=nom;
		
	}
	
	public long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	@Override
	public String toString() {
		return "Equipe [idEquipe=" + idEquipe + ", nomEquipe=" + nomEquipe + "]";
	}
}
