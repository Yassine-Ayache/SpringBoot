package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
