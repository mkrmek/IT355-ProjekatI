package com.example.studenti.controller;

import com.example.studenti.model.Predmet;
import com.example.studenti.service.PredmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/predmeti")
public class PredmetController {

    @Autowired
    private PredmetService servis;

    @GetMapping
    public String sviPredmeti(Model model) {
        model.addAttribute("predmeti", servis.sviPredmeti());
        return "predmeti";
    }

    @GetMapping("/dodaj")
    public String formaDodavanja(Model model) {
        model.addAttribute("predmet", new Predmet());
        return "forma-predmet";
    }

    @PostMapping("/dodaj")
    public String dodajPredmet(@ModelAttribute Predmet predmet) {
        servis.dodajPredmet(predmet);
        return "redirect:/predmeti";
    }

    @GetMapping("/izmeni/{id}")
    public String formaIzmene(@PathVariable int id, Model model) {
        model.addAttribute("predmet", servis.nadjiPredmet(id));
        return "forma-predmet";
    }

    @PostMapping("/izmeni")
    public String izmeniPredmet(@ModelAttribute Predmet predmet) {
        servis.izmeniPredmet(predmet);
        return "redirect:/predmeti";
    }

    @GetMapping("/obrisi/{id}")
    public String obrisiPredmet(@PathVariable int id) {
        servis.obrisiPredmet(id);
        return "redirect:/predmeti";
    }
}
