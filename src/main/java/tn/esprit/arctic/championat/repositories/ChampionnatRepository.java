package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Championnat;

public interface ChampionnatRepository extends JpaRepository<Championnat,Long> {
}
