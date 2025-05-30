package com.example.studenti.controller;

import com.example.studenti.model.Student;
import com.example.studenti.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/studenti")
public class StudentController {

    @Autowired
    private StudentService servis;

    @GetMapping
    public String sviStudenti(Model model) {
        model.addAttribute("studenti", servis.sviStudenti());
        return "studenti";
    }

    @GetMapping("/dodaj")
    public String formaDodavanja(Model model) {
        model.addAttribute("student", new Student());
        return "forma-student";
    }

    @PostMapping("/dodaj")
    public String dodajStudenta(@ModelAttribute Student student) {
        servis.dodajStudenta(student);
        return "redirect:/studenti";
    }

    @GetMapping("/izmeni/{id}")
    public String formaIzmene(@PathVariable int id, Model model) {
        model.addAttribute("student", servis.nadjiStudenta(id));
        return "forma-student";
    }

    @PostMapping("/izmeni")
    public String izmeniStudenta(@ModelAttribute Student student) {
        servis.izmeniStudenta(student);
        return "redirect:/studenti";
    }

    @GetMapping("/obrisi/{id}")
    public String obrisiStudenta(@PathVariable int id) {
        servis.obrisiStudenta(id);
        return "redirect:/studenti";
    }
}
