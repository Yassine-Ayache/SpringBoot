package tn.esprit.arctic.championat.entities;

import jakarta.persistence.*;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;
    Float montant;
    String annee;
    Boolean archived;
    @ManyToOne
    Equipe equipe2;
    @ManyToOne
    Sponsor sponsor;
}
