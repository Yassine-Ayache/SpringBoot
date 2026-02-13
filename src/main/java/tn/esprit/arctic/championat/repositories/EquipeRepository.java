package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
