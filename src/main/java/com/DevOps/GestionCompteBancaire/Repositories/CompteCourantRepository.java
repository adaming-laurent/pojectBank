package com.DevOps.GestionCompteBancaire.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevOps.GestionCompteBancaire.Entities.CompteCourant;

public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long>{

}
