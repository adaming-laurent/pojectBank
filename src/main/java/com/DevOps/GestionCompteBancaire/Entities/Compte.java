package com.DevOps.GestionCompteBancaire.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = CompteEpargne.class, name = "epargne"), @JsonSubTypes.Type(value = CompteCourant.class, name = "courant")})
public class Compte implements Serializable{

	//Attributes
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long idCompte;
	private Date dateCreation;
	private double solde;
	
//	@ManyToOne  @JoinColumn( name="idUtilisateur" )
//    private Utilisateur utilisateur;
	
	//Constructors
	public Compte() {
		super();
	}
	public Compte(Date dateCreation, double solde) {
		super();
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	
	//Getters and setters
	public Long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
	}
	
}
