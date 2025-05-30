package com.example.studenti.controller;

import com.example.studenti.model.Ocena;
import com.example.studenti.service.OcenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ocene")
public class OcenaController {

    @Autowired
    private OcenaService servis;

    @GetMapping
    public String sveOcene(Model model) {
        model.addAttribute("ocene", servis.sveOcene());
        return "ocene";
    }

    @GetMapping("/dodaj")
    public String formaDodavanja(Model model) {
        model.addAttribute("ocena", new Ocena());
        return "forma-ocena";
    }

    @PostMapping("/dodaj")
    public String dodajOcenu(@ModelAttribute Ocena ocena) {
        servis.dodajOcenu(ocena);
        return "redirect:/ocene";
    }

    @GetMapping("/izmeni/{id}")
    public String formaIzmene(@PathVariable int id, Model model) {
        model.addAttribute("ocena", servis.nadjiOcenu(id));
        return "forma-ocena";
    }

    @PostMapping("/izmeni")
    public String izmeniOcenu(@ModelAttribute Ocena ocena) {
        servis.izmeniOcenu(ocena);
        return "redirect:/ocene";
    }

    @GetMapping("/obrisi/{id}")
    public String obrisiOcenu(@PathVariable int id) {
        servis.obrisiOcenu(id);
        return "redirect:/ocene";
    }
}
