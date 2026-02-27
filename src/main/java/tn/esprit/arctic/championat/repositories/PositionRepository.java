package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Position;

public interface PositionRepository extends JpaRepository<Position,Long> {
}
