package com.example.studenti.service;

import com.example.studenti.model.Predmet;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PredmetService {
    private final Map<Integer, Predmet> predmeti = new HashMap<>();
    private int trenutniId = 1;

    public List<Predmet> sviPredmeti() {
        return new ArrayList<>(predmeti.values());
    }

    public void dodajPredmet(Predmet predmet) {
        predmet.setId(trenutniId++);
        predmeti.put(predmet.getId(), predmet);
    }

    public Predmet nadjiPredmet(int id) {
        return predmeti.get(id);
    }

    public void izmeniPredmet(Predmet predmet) {
        predmeti.put(predmet.getId(), predmet);
    }

    public void obrisiPredmet(int id) {
        predmeti.remove(id);
    }
}
