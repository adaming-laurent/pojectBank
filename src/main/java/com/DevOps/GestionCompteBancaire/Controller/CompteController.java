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

import com.DevOps.GestionCompteBancaire.Entities.Compte;
import com.DevOps.GestionCompteBancaire.Services.ICompteService;

@CrossOrigin
@Controller
public class CompteController {
	
	@Autowired
	ICompteService compteService;
	
	@RequestMapping(value="/compte",method=RequestMethod.POST)
	public Compte save(@RequestBody Compte compte) {
		return compteService.save(compte);
	}
	
	@RequestMapping(value = "/compte",method = RequestMethod.GET)
	public List<Compte> findComptes(){
		return compteService.findComptes();
	}
	
	@RequestMapping(value = "/compte/{id}", method = RequestMethod.GET)
	public Optional<Compte> findCompteById(@PathVariable("id") Long id){
		return compteService.findCompteById(id);
	}
	
	@RequestMapping(value = "/compte/{id}", method = RequestMethod.DELETE)
	public void deleteCompteById(@PathVariable("id") Long id) {
		compteService.deleteCompteById(id);
	}
	
	public Compte updateCompte(@PathVariable("id") Long id, @RequestBody Compte compte) {
		Compte currentCompte = compteService.findCompte(id);
		currentCompte.setDateCreation(compte.getDateCreation());
		currentCompte.setSolde(compte.getSolde());
		return compteService.save(currentCompte);
	}
	
}
