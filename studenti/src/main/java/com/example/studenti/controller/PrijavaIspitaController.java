package com.example.studenti.controller;

import com.example.studenti.model.PrijavaIspita;
import com.example.studenti.service.PrijavaIspitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/prijave")
public class PrijavaIspitaController {

    @Autowired
    private PrijavaIspitaService servis;

    @GetMapping
    public String svePrijave(Model model) {
        model.addAttribute("prijave", servis.svePrijave());
        return "prijave";
    }

    @GetMapping("/dodaj")
    public String formaDodavanja(Model model) {
        model.addAttribute("prijava", new PrijavaIspita());
        return "forma-prijava";
    }

    @PostMapping("/dodaj")
    public String dodajPrijavu(@ModelAttribute PrijavaIspita prijava) {
        servis.dodajPrijavu(prijava);
        return "redirect:/prijave";
    }

    @GetMapping("/izmeni/{id}")
    public String formaIzmene(@PathVariable int id, Model model) {
        model.addAttribute("prijava", servis.nadjiPrijavu(id));
        return "forma-prijava";
    }

    @PostMapping("/izmeni")
    public String izmeniPrijavu(@ModelAttribute PrijavaIspita prijava) {
        servis.izmeniPrijavu(prijava);
        return "redirect:/prijave";
    }

    @GetMapping("/obrisi/{id}")
    public String obrisiPrijavu(@PathVariable int id) {
        servis.obrisiPrijavu(id);
        return "redirect:/prijave";
    }
}
