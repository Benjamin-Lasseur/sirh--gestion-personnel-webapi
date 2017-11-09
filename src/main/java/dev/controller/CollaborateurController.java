package dev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Banque;
import dev.entite.Collaborateur;
import dev.entite.Departement;
import dev.repository.BanqueRepository;
import dev.repository.CollaborateurRepository;
import dev.repository.DepartementRepository;

@RestController
@RequestMapping("/collaborateurs")
public class CollaborateurController {
	@Autowired
	private CollaborateurRepository collabRepo;
	@Autowired
	private DepartementRepository departementRepo;
	@Autowired
	private BanqueRepository banRep;

	@GetMapping
	public List<Collaborateur> listerCollaborateurs(@RequestParam("departement") Optional<Integer> id) {
		if (id.isPresent()) {
			Departement departement = departementRepo.findOne(id.get());
			return this.collabRepo.findByDepartement(departement);
		}
		return this.collabRepo.findAll();

	}

	@GetMapping("/{matricule}")
	public Collaborateur getCollaborateur(@PathVariable Integer matricule) {
		return this.collabRepo.findByMatricule(matricule);

	}

	@GetMapping("/{matricule}/banque")
	public Banque getBanqueCollaborateur(@PathVariable Integer matricule) {
		return this.collabRepo.findByMatricule(matricule).getBanque();

	}

	@PutMapping("/{matricule}")
	public void setCollaborateur(@PathVariable Integer matricule, @RequestBody Collaborateur collab) {
		collab.setId(collabRepo.findByMatricule(matricule).getId());
		this.collabRepo.save(collab);

	}

	@PutMapping("/{matricule}/banque")
	public void setBanqueCollaborateur(@PathVariable Integer matricule, @RequestBody Banque banque) {
		banRep.save(banque);
		Collaborateur col = collabRepo.findByMatricule(matricule);
		col.setBanque(banque);
		collabRepo.save(col);

	}

}