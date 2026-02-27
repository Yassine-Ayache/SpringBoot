package tn.esprit.arctic.championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
