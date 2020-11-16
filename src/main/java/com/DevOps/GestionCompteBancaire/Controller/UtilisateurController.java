package com.DevOps.GestionCompteBancaire.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DevOps.GestionCompteBancaire.Entities.Utilisateur;
import com.DevOps.GestionCompteBancaire.Services.IUtilisateurService;

@CrossOrigin
@Controller
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilisateurService;
	
	@RequestMapping(value="/utilisateur",method=RequestMethod.POST)
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.save(utilisateur);
	}
	
	@RequestMapping(value="/utilisateur",method=RequestMethod.GET)
	public List<Utilisateur> findUtilisateurs(){
		return utilisateurService.findUtilisateurs();
	}
	
	@RequestMapping(value="/utilisateur/{id}",method = RequestMethod.GET)
	public Optional<Utilisateur> findUtilisateurById(@PathVariable("id") Long id){
		return utilisateurService.findUtilisateurById(id);
	}
	
	@RequestMapping(value = "/utilisateur/{id}",method = RequestMethod.DELETE)
	public void deleteUtilisateurById(@PathVariable("id") Long id) {
		utilisateurService.deleteUtilisateurById(id);
	}
	
	@RequestMapping(value = "/utilisateur/{id}",method = RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findUtilisateur(id);
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		return utilisateurService.save(currentUtilisateur);
	}
}
