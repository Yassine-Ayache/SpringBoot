package tn.esprit.arctic.championat.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.championat.entities.Pilote;
import tn.esprit.arctic.championat.services.IPiloteService;
import tn.esprit.arctic.championat.services.PiloteService;

@RestController
@AllArgsConstructor
@RequestMapping("/Pilote")
public class PiloteController {

    private IPiloteService piloteService;

    @PostMapping("/add")
    public String addPilote(@RequestBody Pilote p) {
        return piloteService.addPilote(p);
    }
}
