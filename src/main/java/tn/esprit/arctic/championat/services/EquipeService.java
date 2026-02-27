package tn.esprit.arctic.championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.entities.Equipe;
import tn.esprit.arctic.championat.repositories.EquipeRepository;

@AllArgsConstructor
@Service
public class EquipeService implements IEquipeService{
    EquipeRepository er;
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
