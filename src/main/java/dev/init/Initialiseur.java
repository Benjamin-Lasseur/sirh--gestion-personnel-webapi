package dev.init;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.entite.Banque;
import dev.entite.Collaborateur;
import dev.entite.Departement;
import dev.repository.BanqueRepository;
import dev.repository.CollaborateurRepository;
import dev.repository.DepartementRepository;

@Service
public class Initialiseur {

	@Autowired
	CollaborateurRepository colRep;
	@Autowired
	DepartementRepository depRep;
	@Autowired
	BanqueRepository banRep;

	public void init() {
		Stream.of(new Banque("BP", "0000000000000000", "000000000000"),
				new Banque("BD", "000000111000000", "055000000000")).forEach(ban -> banRep.save(ban));
		Stream.of(new Departement("Info"), new Departement("Ressources Humaines")).forEach(dep -> depRep.save(dep));
		Stream.of(
				new Collaborateur(55, "Lasseur", "Benjamin", "Dev", depRep.findByNom("Info"),
						"benjamin.lasseur@email.com", "00000000", banRep.findOne(Integer.valueOf(1))),
				new Collaborateur(60, "Chiaine", "Marie", "Dev", depRep.findByNom("Ressources Humaines"),
						"benjamin.lasseur@email.com", "00000000", banRep.findOne(Integer.valueOf(2))))
				.forEach(col -> colRep.save(col));
	}
}
