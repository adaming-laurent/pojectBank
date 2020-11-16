package com.DevOps.GestionCompteBancaire.Entities;


import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;
	public CompteCourant() {
		super();
	}
	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
}
