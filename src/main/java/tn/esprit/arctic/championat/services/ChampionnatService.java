package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.repositories.ChampionnatRepository;

@AllArgsConstructor
@Service
public class ChampionnatService {
    ChampionnatRepository cr;
}
