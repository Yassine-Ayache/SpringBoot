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
public class Pilote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPilote;
    String libelle;
    Integer nbPointsTotal;
    Integer classementGeneral;
    Categorie categorie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="pilote")
    private Set<Position> positions;
    @ManyToOne
    Equipe equipe;
}
