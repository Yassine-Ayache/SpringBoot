package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.arctic.championat.entities.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor,Long> {

}
