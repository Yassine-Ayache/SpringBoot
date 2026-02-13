package tn.esprit.arctic.championat.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;
    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;
    private Boolean archived;
    private LocalDate dateCreation;
    private LocalDate dateDerniereModification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="sponsor")
    private Set<Contrat> contrats;
}

