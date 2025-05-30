package com.example.studenti.service;

import com.example.studenti.model.Profesor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfesorService {
    private final Map<Integer, Profesor> profesori = new HashMap<>();
    private int trenutniId = 1;

    public List<Profesor> sviProfesori() {
        return new ArrayList<>(profesori.values());
    }

    public void dodajProfesora(Profesor profesor) {
        profesor.setId(trenutniId++);
        profesori.put(profesor.getId(), profesor);
    }

    public Profesor nadjiProfesora(int id) {
        return profesori.get(id);
    }

    public void izmeniProfesora(Profesor profesor) {
        profesori.put(profesor.getId(), profesor);
    }

    public void obrisiProfesora(int id) {
        profesori.remove(id);
    }
}
