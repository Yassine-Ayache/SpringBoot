package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Pilote;

public interface PiloteRepository extends JpaRepository<Pilote,Long> {
}
