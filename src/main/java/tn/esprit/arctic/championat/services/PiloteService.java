package tn.esprit.arctic.championat.services;

import tn.esprit.arctic.championat.entities.Pilote;
import tn.esprit.arctic.championat.repositories.PiloteRepository;

public class PiloteService{
    PiloteRepository pr;
    public String addPilote(Pilote p) {
        pr.save(p);
        return "Pilote ajouté avec succes";
    }

}
