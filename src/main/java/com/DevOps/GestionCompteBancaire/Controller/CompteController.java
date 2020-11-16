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

import com.DevOps.GestionCompteBancaire.Entities.Compte;
import com.DevOps.GestionCompteBancaire.Services.ICompteService;

@CrossOrigin
@Controller
public class CompteController {
	
	@Autowired
	ICompteService compteService;
	
	@PostMapping("/compte")
	public Compte save(@RequestBody Compte compte) {
		return compteService.save(compte);
	}
	
	@GetMapping("/compte")
	public List<Compte> findComptes(){
		return compteService.findComptes();
	}
	
	@GetMapping("/compte/{id}")
	public Optional<Compte> findCompteById(@PathVariable("id") Long id){
		return compteService.findCompteById(id);
	}
	
	@DeleteMapping("/compte/{id}")
	public void deleteCompteById(@PathVariable("id") Long id) {
		compteService.deleteCompteById(id);
	}
	
	@PutMapping("/compte/{id}")
	public Compte updateCompte(@PathVariable("id") Long id, @RequestBody Compte compte) {
		Compte currentCompte = compteService.findCompte(id);
		currentCompte.setDateCreation(compte.getDateCreation());
		currentCompte.setSolde(compte.getSolde());
		return compteService.save(currentCompte);
	}
	
}
