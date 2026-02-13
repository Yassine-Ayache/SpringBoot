package tn.esprit.arctic.championat.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipe;
    String libelle;
    Integer nbPointsTotal;
    Integer classementGeneral;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="equipe")
    private Set<Pilote> pilotes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="equipe2")
    private Set<Contrat> contrats;
}
