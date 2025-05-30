package com.example.studenti.controller;

import com.example.studenti.model.Profesor;
import com.example.studenti.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/profesori")
public class ProfesorController {

    @Autowired
    private ProfesorService servis;

    @GetMapping
    public String sviProfesori(Model model) {
        model.addAttribute("profesori", servis.sviProfesori());
        return "profesori";
    }

    @GetMapping("/dodaj")
    public String formaDodavanja(Model model) {
        model.addAttribute("profesor", new Profesor());
        return "forma-profesor";
    }

    @PostMapping("/dodaj")
    public String dodajProfesora(@ModelAttribute Profesor profesor) {
        servis.dodajProfesora(profesor);
        return "redirect:/profesori";
    }

    @GetMapping("/izmeni/{id}")
    public String formaIzmene(@PathVariable int id, Model model) {
        model.addAttribute("profesor", servis.nadjiProfesora(id));
        return "forma-profesor";
    }

    @PostMapping("/izmeni")
    public String izmeniProfesora(@ModelAttribute Profesor profesor) {
        servis.izmeniProfesora(profesor);
        return "redirect:/profesori";
    }

    @GetMapping("/obrisi/{id}")
    public String obrisiProfesora(@PathVariable int id) {
        servis.obrisiProfesora(id);
        return "redirect:/profesori";
    }
}
