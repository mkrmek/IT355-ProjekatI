package com.example.studenti.service;

import com.example.studenti.model.PrijavaIspita;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PrijavaIspitaService {
    private final Map<Integer, PrijavaIspita> prijave = new HashMap<>();
    private int trenutniId = 1;

    public List<PrijavaIspita> svePrijave() {
        return new ArrayList<>(prijave.values());
    }

    public void dodajPrijavu(PrijavaIspita prijava) {
        prijava.setId(trenutniId++);
        prijave.put(prijava.getId(), prijava);
    }

    public PrijavaIspita nadjiPrijavu(int id) {
        return prijave.get(id);
    }

    public void izmeniPrijavu(PrijavaIspita prijava) {
        prijave.put(prijava.getId(), prijava);
    }

    public void obrisiPrijavu(int id) {
        prijave.remove(id);
    }
}
