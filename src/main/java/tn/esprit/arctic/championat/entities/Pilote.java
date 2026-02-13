package tn.esprit.arctic.championat.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPilote;
    String libelle;
    Integer nbPointsTotal;
    Integer classementGeneral;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="pilote")
    private Set<Position> positions;
    @ManyToOne
    Equipe equipe;
}
