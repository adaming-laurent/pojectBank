package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.Compte;
import com.DevOps.GestionCompteBancaire.Repositories.CompteRepository;

@Service
public class CompteServive implements ICompteService{
	
	@Autowired
	CompteRepository compteRepository;
	
	@Override
	public Compte save(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public List<Compte> findComptes() {
		return compteRepository.findAll();
	}

	@Override
	public Optional<Compte> findCompteById(Long id) {
		return compteRepository.findById(id);
	}

	@Override
	public Compte findCompte(Long id) {
		return compteRepository.getOne(id);
	}

	@Override
	public void deleteCompteById(Long id) {
		compteRepository.deleteById(id);
	}
	
}
