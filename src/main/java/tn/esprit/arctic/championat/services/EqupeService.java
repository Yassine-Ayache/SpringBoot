package tn.esprit.arctic.championat.services;

import tn.esprit.arctic.championat.entities.Equipe;
import tn.esprit.arctic.championat.repositories.EquipeRepository;

public class EqupeService {
    EquipeRepository er;
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
