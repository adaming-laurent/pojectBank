package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.CompteCourant;
import com.DevOps.GestionCompteBancaire.Repositories.CompteCourantRepository;

@Service
public class CompteCourantService implements ICompteCourantService{
	
	@Autowired
	CompteCourantRepository compteCourantRepository;
	
	@Override
	public CompteCourant save(CompteCourant compteCourant) {
		return compteCourantRepository.save(compteCourant);
	}

	@Override
	public List<CompteCourant> findCompteCourants() {
		return compteCourantRepository.findAll();
	}

	@Override
	public Optional<CompteCourant> findCompteCourantById(Long id) {
		return compteCourantRepository.findById(id);
	}

	@Override
	public CompteCourant findCompteCourant(Long id) {
		return compteCourantRepository.getOne(id);
	}

	@Override
	public void deleteCompteCourantById(Long id) {
		compteCourantRepository.deleteById(id);
	}

}
