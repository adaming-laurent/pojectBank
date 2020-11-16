package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.CompteEpargne;

@Service
public interface ICompteEpargneService {
	
	public CompteEpargne save(CompteEpargne compteEpargne);
	public List<CompteEpargne> findCompteEpargnes();
	public Optional<CompteEpargne> findCompteEpargneById(Long id);
	public CompteEpargne findCompteEpargne(Long id);
	public void deleteCompteEpargneById(Long id);
}
