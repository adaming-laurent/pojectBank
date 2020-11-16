package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.CompteEpargne;
import com.DevOps.GestionCompteBancaire.Repositories.CompteEpargneRepository;

@Service
public class CompteEpargneService implements ICompteEpargneService{
	
	@Autowired
	CompteEpargneRepository compteEpargneRepository;

	@Override
	public CompteEpargne save(CompteEpargne compteEpargne) {
		return compteEpargneRepository.save(compteEpargne);
	}

	@Override
	public List<CompteEpargne> findCompteEpargnes() {
		return compteEpargneRepository.findAll();
	}

	@Override
	public Optional<CompteEpargne> findCompteEpargneById(Long id) {
		return compteEpargneRepository.findById(id);
	}

	@Override
	public CompteEpargne findCompteEpargne(Long id) {
		return compteEpargneRepository.getOne(id);
	}

	@Override
	public void deleteCompteEpargneById(Long id) {
		compteEpargneRepository.deleteById(id);
	}

}
