package tn.esprit.arctic.championat.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Championnat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChampionnat;
    Categorie categorie;
    String libelleC;
    Integer annee;
    @OneToOne
    private DetailChampionnat detailChampionnat;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Course> courses;
}
