package com.DevOps.GestionCompteBancaire.Entities;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux;
	public CompteEpargne() {
		super();
	}
	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}
	

}
