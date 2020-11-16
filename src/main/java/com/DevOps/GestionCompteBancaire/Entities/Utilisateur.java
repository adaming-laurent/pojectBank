package com.DevOps.GestionCompteBancaire.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	
	@OneToMany(
			mappedBy = "utilisateur",
			cascade = CascadeType.ALL,
			orphanRemoval = false
	)
	private List<Compte> comptes;
	
	//Constructors
	public Utilisateur() {
		super();
	}
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, List<Compte> comptes) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.comptes = comptes;
	}
	
	//Getters and setters
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", comptes=" + comptes + "]";
	}
	
}
