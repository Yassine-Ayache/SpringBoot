package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.repositories.PiloteRepository;

@AllArgsConstructor
@Service
public class PositionService {
    PiloteRepository pr;
}
