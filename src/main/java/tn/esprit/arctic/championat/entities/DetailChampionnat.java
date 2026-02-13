package tn.esprit.arctic.championat.entities;
import jakarta.persistence.*;

@Entity
public class DetailChampionnat {
    @Id
    String code;
    String description;
    @OneToOne(mappedBy="detailChampionnat")
    private Championnat championnat;
}
