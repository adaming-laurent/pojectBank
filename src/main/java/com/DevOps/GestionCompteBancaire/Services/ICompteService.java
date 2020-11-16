package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.Compte;

@Service
public interface ICompteService {

	public Compte save(Compte compte);
	public List<Compte> findComptes();
	public Optional<Compte> findCompteById(Long id);
	public Compte findCompte(Long id);
	public void deleteCompteById(Long id);
}
