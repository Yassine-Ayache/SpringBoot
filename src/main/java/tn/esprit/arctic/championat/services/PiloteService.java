package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.entities.Pilote;
import tn.esprit.arctic.championat.repositories.PiloteRepository;

@AllArgsConstructor
@Service
public class PiloteService implements IPiloteService{
    PiloteRepository pr;
    public String addPilote(Pilote p) {
        pr.save(p);
        return "Pilote ajouté avec succes";
    }

}
