package tn.esprit.arctic.championat.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championat.entities.Equipe;
import tn.esprit.arctic.championat.services.EquipeService;
import tn.esprit.arctic.championat.services.IEquipeService;

@AllArgsConstructor
@RestController
@RequestMapping("/Equipe")
public class EquipeController {

    private IEquipeService equipeService;

    @PostMapping("/add")
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }
}
