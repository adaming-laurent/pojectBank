package com.DevOps.GestionCompteBancaire.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.DevOps.GestionCompteBancaire.Entities.Utilisateur;
import com.DevOps.GestionCompteBancaire.Services.IUtilisateurService;

@CrossOrigin
@Controller
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	@PostMapping("/utilisateur")
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}
	
	@GetMapping("/utilisateur")
	public List<Utilisateur> findUtilisateurs(){
		return utilisateurService.findUtilisateurs();
	}
	
	@GetMapping("/utilisateur/{id}")
	public Optional<Utilisateur> findUtilisateurById(@PathVariable("id") Long id){
		return utilisateurService.findUtilisateurById(id);
	}


	@DeleteMapping("/utilisateur/{id}")
	public void deleteUtilisateurById(@PathVariable("id") Long id) {
		utilisateurService.deleteUtilisateurById(id);
	}

	@PutMapping("/utilisateur/{id}")
	public Utilisateur updateUtilisateur(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findUtilisateur(id);
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		return utilisateurService.save(currentUtilisateur);
	}
}
