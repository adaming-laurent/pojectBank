package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.Utilisateur;
import com.DevOps.GestionCompteBancaire.Repositories.UtilisateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService{

	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public List<Utilisateur> findUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Optional<Utilisateur> findUtilisateurById(Long id) {
		return utilisateurRepository.findById(id);
	}

	@Override
	public Utilisateur findUtilisateur(Long id) {
		return utilisateurRepository.getOne(id);
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		utilisateurRepository.deleteById(id);
		
	}

}
