package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.repositories.DetailChampionnatRepository;

@AllArgsConstructor
@Service
public class DetailChampionnatService {
    DetailChampionnatRepository dcr;
}
