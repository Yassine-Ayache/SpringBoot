package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.DetailChampionnat;

public interface DetailChampionnatRepository extends JpaRepository<DetailChampionnat,String> {
}
