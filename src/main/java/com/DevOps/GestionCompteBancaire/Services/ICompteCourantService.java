package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.CompteCourant;

@Service
public interface ICompteCourantService {

	public CompteCourant save(CompteCourant compteCourant);
	public List<CompteCourant> findCompteCourants();
	public Optional<CompteCourant> findCompteCourantById(Long id);
	public CompteCourant findCompteCourant(Long id);
	public void deleteCompteCourantById(Long id);
}
