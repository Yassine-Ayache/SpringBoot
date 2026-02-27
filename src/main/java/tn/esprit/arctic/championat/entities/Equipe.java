package tn.esprit.arctic.championat.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
