package com.DevOps.GestionCompteBancaire.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevOps.GestionCompteBancaire.Entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
