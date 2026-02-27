package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.repositories.ContratRepository;

@AllArgsConstructor
@Service
public class ContratService {
    ContratRepository cr;
}
