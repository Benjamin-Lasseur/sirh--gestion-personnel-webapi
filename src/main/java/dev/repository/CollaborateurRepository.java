package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Collaborateur;
import dev.entite.Departement;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {

	List<Collaborateur> findByDepartement(Departement departement);

	Collaborateur findByMatricule(Integer matricule);
}
