package com.DevOps.GestionCompteBancaire.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevOps.GestionCompteBancaire.Entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{

}
