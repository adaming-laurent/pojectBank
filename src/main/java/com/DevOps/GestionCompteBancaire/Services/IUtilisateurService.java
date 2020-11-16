package com.DevOps.GestionCompteBancaire.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DevOps.GestionCompteBancaire.Entities.Utilisateur;

@Service
public interface IUtilisateurService {

	public Utilisateur save(Utilisateur utilisateur);
	public List<Utilisateur> findUtilisateurs();
	public Optional<Utilisateur> findUtilisateurById(Long id);
	public Utilisateur findUtilisateur(Long id);/*utilise dans le put du controller*/
	public void deleteUtilisateurById(Long id);

}
