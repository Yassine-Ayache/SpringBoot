package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.repositories.CourseRepository;

@AllArgsConstructor
@Service
public class CourseService {
    CourseRepository cr;
}
