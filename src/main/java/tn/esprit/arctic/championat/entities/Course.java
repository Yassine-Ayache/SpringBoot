package tn.esprit.arctic.championat.entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCourse;
    String emplacement;
    LocalDate dateCourse;
    @ManyToMany(mappedBy="courses", cascade = CascadeType.ALL)
    private Set<Championnat> championnats;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="course")
    private Set<Position> positions;
}
