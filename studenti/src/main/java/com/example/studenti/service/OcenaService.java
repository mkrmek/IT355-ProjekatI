package com.example.studenti.service;

import com.example.studenti.model.Ocena;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OcenaService {
    private final Map<Integer, Ocena> ocene = new HashMap<>();
    private int trenutniId = 1;

    public List<Ocena> sveOcene() {
        return new ArrayList<>(ocene.values());
    }

    public void dodajOcenu(Ocena ocena) {
        ocena.setId(trenutniId++);
        ocene.put(ocena.getId(), ocena);
    }

    public Ocena nadjiOcenu(int id) {
        return ocene.get(id);
    }

    public void izmeniOcenu(Ocena ocena) {
        ocene.put(ocena.getId(), ocena);
    }

    public void obrisiOcenu(int id) {
        ocene.remove(id);
    }
}
