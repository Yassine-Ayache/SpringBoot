package tn.esprit.arctic.championat.entities;
import jakarta.persistence.*;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPosition;
    Integer classement;
    Integer nbPoints;
    @ManyToOne
    Course course;
    @ManyToOne
    Pilote pilote;
}
